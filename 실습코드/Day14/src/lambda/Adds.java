package lambda;

public class Adds { // 익명 내부 클래스 사용하는 방식
    public static void main(String[] args) {
        IAdd a = new IAdd() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
    }
}
