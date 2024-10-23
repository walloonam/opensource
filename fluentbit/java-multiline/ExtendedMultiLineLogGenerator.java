public class ExtendedMultiLineLogGenerator {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            try {
                // 여러 단계의 메서드 호출
                firstMethod();
            } catch (Exception e) {
                // 예외 스택 트레이스를 로그로 출력
                e.printStackTrace();
            }
            Thread.sleep(5000); // 5초마다 로그 생성
        }
    }

    private static void firstMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        thirdMethod();
    }

    private static void thirdMethod() {
        // 예외를 강제로 발생시킴
        throw new RuntimeException("This is a test exception for generating a more complex multiline log.");
    }
}

