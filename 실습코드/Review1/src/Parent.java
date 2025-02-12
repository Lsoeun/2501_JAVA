public class Parent {
    public void show() {
        System.out.println("부모 클래스");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("자식 클래스");
    }
}
