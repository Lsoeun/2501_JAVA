package lambda;

public class StringConCatTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString(s1, s2);
    }
}
