package method;

public class MethodEx {
    public void display(int a, double b) {
        System.out.println("정수" + a + "실수" + b);
    }

    public void display(double a, double b) {
        // 매개변수의 이름을 바꾸는 것은 시그니처가 다르다고 인식하지 않음
        // 꼭 매개변수의 갯수나 타입을 바꿔야 함!
        System.out.println();
    }
}
