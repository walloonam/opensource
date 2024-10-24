# YAML 파일 설정 정리

## `muliti1.yaml`
- 기본 로그 설정

---

## `multi4.yaml`
- **Multiline.Parser**: `java` 적용
- **parsers.conf**: `java` 파서 설정
- 시간 있는 로그와 없는 로그 모두 처리

---

## `multi5.yaml`
- **Multiline.Parser**: `java` 적용
- **parsers.conf**: `java` 파서 설정
- 시간 없는 로그 처리

---

## `multi6.yaml`
- **Multiline.Parser**: `java` 적용
- **parsers.conf**: 파서 설정 없음
- 시간 있는 로그 처리

---

## `multi7.yaml`
- **Multiline.Parser**: `java` 적용
- **parsers.conf**: 파서 설정 없음
- 시간 없는 로그 처리

---

## `multi8.yaml`
- **Multiline.Parser**: `java` 적용
- **parsers.conf**: 파서 설정 없음
- 다양한 시간 형식 로그 처리

---

## `multi9.yaml`
- **Multiline.Parser**: `java_multi` 적용
- **parsers.conf**: `java_multi` 파서 설정
- 에러 발생

---

## `multi10.yaml ~ multi14.yaml`
- **custom_parsers.conf**: `custom` 파서 생성
- **Multiline.Parser**: `custom` 적용
- 다양한 시간 형식 로그 처리

---

## `Default-cri.yaml`
- **CRI 파서**: 내장 파서 사용

