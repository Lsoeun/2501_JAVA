package method;

public class OverloadingEx {
    // 두 정수를 더하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 세 정수를 더하는 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 두 실수를 더하는 메서드
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingEx ex = new OverloadingEx();
        int sum1 = ex.add(5, 10);
        int sum2 = ex.add(5, 10, 20);
        double sum3 = ex.add(5.5, 10.2);
    }
}
