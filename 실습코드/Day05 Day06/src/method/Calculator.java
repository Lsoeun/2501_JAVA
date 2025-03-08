package method;

public class Calculator {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calculator = new Calculator(); // 객체 생성

        // add 메서드 호출
        int sum = calculator.add(num1, num2);

        // 결과 출력
        System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
    }
}
