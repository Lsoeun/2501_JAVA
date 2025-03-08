package lambda;

public class MyCalculatorTest {
    public static void main(String[] args) {
        // 익명 내부 클래스로 구현
        // 람다를 쓰지 않으면 이렇게 정의!
        MyCalculator calc = new MyCalculator(){
            @Override
            public int plus(int num1, int num2) {
                return num1 + num2;
            }
        };
        int result = calc.plus(10, 20);
        System.out.println(result);
    }
}
