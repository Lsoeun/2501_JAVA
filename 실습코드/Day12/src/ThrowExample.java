public class ThrowExample {
    public static void checkAge(int age) {
        try {
            if (age < 18) {
                throw new IllegalArgumentException("나이가 18세 미만 입니다.");
                // 예외를 의도적으로 발생
            }
            System.out.println("나이에 문제가 없습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 예외를 메서드 내에서 처리
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
