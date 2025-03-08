public class A {
    String name;

    public static void main(String[] args) {
        A a = new A(); // 객체 생성
        A c = new A(); // 객체 생성
        System.out.println(a); // A@b4c966a
        System.out.println(c); // A@2f4d3709

        a.name = "A";
        System.out.println(a.name);
        System.out.println(c.name);

        A b = a; // a와 b가 같은 객체를 참조

        a.name = "이이름"; // a의 name을 "이이름"으로 변경
        System.out.println(a.name); // 이이름
        System.out.println(b.name); // 이이름
        System.out.println(c.name); // null

        b.name = "김이름";
        System.out.println(a.name); // 김이름
        System.out.println(b.name); // 김이름
    }
}
