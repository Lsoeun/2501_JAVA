package lambda;

public class Add implements IAdd { // 기존 방식
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Add add2 = new Add();
        add2.add(1, 2);
    }
}
