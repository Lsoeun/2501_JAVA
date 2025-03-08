package lambda;

public class MyCalculatorTest2 {
    public static void main(String[] args) {
        // 람다식으로 구현
        MyCalculator calc = (x, y) -> x + y;
        int result = calc.plus(10, 20);
        System.out.println(result);
    }
}
