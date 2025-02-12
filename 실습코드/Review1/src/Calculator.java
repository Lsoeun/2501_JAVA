public class Calculator {
    // static 변수: 모든 객체가 공유하는 계산 결과
    public static int result;

    // 더하기
    public void add(int a, int b) {
        result = a + b;
        System.out.println("더하기 결과: " + result);
    }

    // 빼기
    public void subtract(int a, int b) {
        result = a - b;
        System.out.println("빼기 결과: " + result);
    }

    // 곱하기
    public void multiply(int a, int b) {
        result = a * b;
        System.out.println("곱하기 결과: " + result);
    }

    // 나누기
    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: 0으로 나눌 수 없습니다.");
        } else {
            result = a / b;
            System.out.println("나누기 결과: " + result);
        }
    }

    // 계산 결과 반환
    public static int getResult() {
        return result;
    }

    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calc = new Calculator();

        // 연산 수행
        calc.add(10, 5);        // 더하기
        calc.subtract(10, 5);   // 빼기
        calc.multiply(10, 5);   // 곱하기
        calc.divide(10, 5);     // 나누기
        calc.divide(10, 0);     // 0으로 나누기 (예외 처리)

        // 최종 결과 출력
        System.out.println("최종 계산 결과: " + Calculator.getResult());
    }
}
