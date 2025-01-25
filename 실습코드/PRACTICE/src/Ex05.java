// 조건 연산자(삼항 연산자) 연습 예제
public class Ex05 {
    public static void main(String[] args) {
        int num1 = 5;  // 첫 번째 숫자
        int num2 = 10; // 두 번째 숫자

        // 삼항 연산자를 사용하여 더 큰 숫자 출력
        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("더 큰 숫자는: " + larger);
    }
}
