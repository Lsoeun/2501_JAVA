public class ClassExample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        System.out.println(c);
        // Class.forName("클래스 이름") 사용하기
        // ClassNotFoundException에 대한 예외 처리가 필요
    }
}
