// ExtendedMultiLineLogGenerator2.java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtendedMultiLineLogGenerator2 {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            try {
                // 여러 단계의 메서드 호출
                firstMethod();
            } catch (Exception e) {
                // 현재 날짜 및 시간 포맷팅
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String timestamp = dtf.format(LocalDateTime.now());

                // 예외 스택 트레이스를 로그로 출력
                System.out.println(timestamp + " ERROR: Exceoption: " + e);
                for (StackTraceElement element : e.getStackTrace()) {
                    System.out.println("    at " + element);
                }
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
        throw new NullPointerException("이것은 NullPointerException 테스트입니다.");
    }
}

