import java.util.logging.Logger;

public class ExtendedMultiLineLogGenerator3 {
    private static final Logger logger = Logger.getLogger(ExtendedMultiLineLogGenerator3.class.getName());

    public static void main(String[] args) {
        while (true) { // 무한 루프를 사용하여 로그를 계속 생성
            try {
                generateException1();
            } catch (Exception e) {
                logger.severe("Caught top-level exception: " + e.toString());
                e.printStackTrace();
            }

            try {
                generateException2();
            } catch (Exception e) {
                logger.severe("Caught nested exception: " + e.toString());
                e.printStackTrace();
            }

            try {
                generateExceptionWithCause();
            } catch (Exception e) {
                logger.severe("Caught exception with cause: " + e.toString());
                e.printStackTrace();
            }

            try {
                generateSuppressedException();
            } catch (Exception e) {
                logger.severe("Caught suppressed exception: " + e.toString());
                e.printStackTrace();
            }

            try {
                generateError(); // Error 테스트용
            } catch (Error e) {
                logger.severe("Caught Error: " + e.toString());
                e.printStackTrace();
            }

            try {
                generateThrowable(); // Throwable 테스트용
            } catch (Throwable t) {
                logger.severe("Caught Throwable: " + t.toString());
                t.printStackTrace();
            }

            // V8 스택 트레이스 유사 로그 생성
            generateV8StackTraceLog();

            // 로그 생성 간격 설정 (예: 5초 대기)
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private static void generateException1() throws Exception {
        throw new Exception("Example Exception 1");
    }

    private static void generateException2() throws Exception {
        try {
            generateNestedException();
        } catch (Exception e) {
            throw new Exception("Nested Exception", e);
        }
    }

    private static void generateNestedException() throws Exception {
        throw new Exception("Inner Exception");
    }

    private static void generateExceptionWithCause() throws Exception {
        Throwable cause = new Exception("Cause of the Exception");
        throw new Exception("Exception with Cause", cause);
    }

    private static void generateSuppressedException() throws Exception {
        Exception mainException = new Exception("Main Exception with Suppressed");
        Exception suppressedException = new Exception("Suppressed Exception");
        mainException.addSuppressed(suppressedException);
        throw mainException;
    }

    private static void generateError() {
        throw new Error("Simulated Error for Testing");
    }

    private static void generateThrowable() throws Throwable {
        throw new Throwable("Simulated Throwable for Testing");
    }

    private static void generateV8StackTraceLog() {
        System.out.println("SERVER: V8 errors stack trace:");
        System.out.println("    at foo (file.js:1:1)");
        System.out.println("    at bar (file.js:2:2)");
        System.out.println("    at baz (file.js:3:3)");
    }
}

