package method;

public class Method {
    public int sum(int a, int b) {
        int result = a + b + 10;
        return result;
    }

    public static void main(String[] args) {
        Method method = new Method(); // 객체 생성
        System.out.println(method.sum(5, 10));
        System.out.println(method.sum(3, 4));
        System.out.println(method.sum(8, 14));
    }
}
