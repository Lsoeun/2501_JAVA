package method;

public class Calculator {
    // add() 메서드
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result; // 결과 값 반환
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Calculator 클래스의 객체 생성
        Calculator calculator = new Calculator();

        // add() 메서드 호출
        int sum = calculator.add(num1, num2);

        // 결과 출력
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
    }
}