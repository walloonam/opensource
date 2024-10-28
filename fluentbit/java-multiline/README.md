# ExtendedMultiLineLogGenerator3

`ExtendedMultiLineLogGenerator3.java`는 다양한 예외와 에러 로그를 생성하여 Fluent Bit과 같은 로그 수집 도구에서 멀티라인 파서 테스트에 사용할 수 있는 Java 프로그램입니다.

## 기능

이 프로그램은 다음과 같은 예외 및 에러 로그를 무한히 생성하여, 다양한 예외 케이스를 테스트할 수 있도록 돕습니다.

- **Java Exception**
- **Nested Exception (중첩 예외)**
- **Exception with Cause (원인 예외)**
- **Suppressed Exception**
- **Error**
- **Throwable**
- **V8 Style Stack Trace**

## 파일 구조

- **ExtendedMultiLineLogGenerator3.java**: 예외 로그를 생성하는 Java 소스 파일
- **Dockerfile**: Java 프로그램을 Docker 컨테이너로 실행하기 위한 설정 파일

## 요구 사항

- **Java 17** 이상 (이 프로젝트는 `openjdk:17-jdk-alpine` 기반 Docker 이미지를 사용합니다)
- **Docker**

## 사용 방법

### 1. Docker 이미지 빌드

프로젝트 디렉토리에서 Docker 이미지를 빌드합니다.

```bash
docker build -t java-log-generator .

### 2. Docker 컨테이너 실행
이미지를 빌드한 후 다음 명령어로 컨테이너를 실행하여 로그를 생성합니다.

```bash
docker run --rm java-log-generator

컨테이너가 시작되면 프로그램이 5초마다 새로운 예외 로그를 출력하며 무한히 실행됩니다. 이를 통해 다양한 예외와 에러 로그를 자동으로 테스트할 수 있습니다.

###3. 생성되는 로그 예시
실행 시 아래와 같은 로그가 생성됩니다.

##Java Exception
```less
코드 복사
SEVERE: Caught top-level exception: java.lang.Exception: Example Exception 1
java.lang.Exception: Example Exception 1
    at ExtendedMultiLineLogGenerator3.generateException1(ExtendedMultiLineLogGenerator3.java:22)
    at ExtendedMultiLineLogGenerator3.main(ExtendedMultiLineLogGenerator3.java:12)
Nested Exception (중첩 예외)
php
SEVERE: Caught nested exception: java.lang.Exception: Nested Exception
java.lang.Exception: Nested Exception
    at ExtendedMultiLineLogGenerator3.generateException2(ExtendedMultiLineLogGenerator3.java:28)
Caused by: java.lang.Exception: Inner Exception
    at ExtendedMultiLineLogGenerator3.generateNestedException(ExtendedMultiLineLogGenerator3.java:34)
    at ExtendedMultiLineLogGenerator3.generateException2(ExtendedMultiLineLogGenerator3.java:26)
V8 Style Stack Trace
java
코드 복사
V8 errors stack trace:
    at foo (file.js:1:1)
    at bar (file.js:2:2)
    at baz (file.js:3:3)
4. Fluent Bit 멀티라인 파서 설정 예시
이 프로그램에서 생성된 로그를 효과적으로 파싱하려면 Fluent Bit의 멀티라인 파서 설정이 필요합니다. 아래는 예외 로그를 멀티라인으로 처리하기 위한 설정 예시입니다.

conf
코드 복사
[MULTILINE_PARSER]
    Name          multiline_java
    Type          regex
    Flush_Interval 1
    Rule      "start_state"         "/.*(?:Exception|Error|Throwable|V8 errors stack trace)/"  "java_after_exception"
    Rule      "java_after_exception" "/^[\t ]*nested exception is:[\t ]*/" "java_start_exception"
    Rule      "java_after_exception" "/^[\r\n]*$/" "java_after_exception"
    Rule      "java_after_exception, java" "/^[\t ]+(?:eval )?at /" "java"
    Rule      "java_after_exception, java" "/^[\t ]+--- End of inner exception stack trace ---$/" "java"
    Rule      "java_after_exception, java" "/^--- End of stack trace from previous location where exception was thrown ---$/" "java"
    Rule      "java_after_exception, java" "/^[\t ]*(?:Caused by|Suppressed):/" "java_after_exception"
    Rule      "java_after_exception, java" "/^[\t ]*... \d+ (?:more|common frames omitted)/" "java"
