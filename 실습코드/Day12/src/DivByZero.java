import java.util.Scanner;

public class DivByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력 받기 위함

        System.out.println("나누는 수를 입력하세요:");
        int dividend = scanner.nextInt();

        System.out.println("나누는 수를 입력하세요:");
        int divisor = scanner.nextInt();
        
        try {
            int result = dividend / divisor; // 나누기 연산
            System.out.println("결과:" + result
            );
        } catch (ArithmeticException e) {
            System.out.println("오류 발생: 0으로 나눌 수 없습니다.");
        } finally {
            scanner.close(); // 리소스 반환
        }
    }
}
