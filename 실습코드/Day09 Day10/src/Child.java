public class Child extends Parent {
    int a = 5; // 자식 클래스의 멤버변수 a

    public void setParentA(int value) {
        super.a = value; // 부모 클래스의 멤버변수 a에 접근하여 값을 설정
    }

    public void printValue() { // 명확히 구분
        System.out.println("Child a : " + this.a);
        System.out.println("Parent a : " + super.a);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printValue();
        child.a = 2; // 자식 클래스의 멤버변수 a의 값을 변경
        child.setParentA(20); // 부모 클래스의 멤버변수 a의 값을 변경
        child.printValue();
    }
}
