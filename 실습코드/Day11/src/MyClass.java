public class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        System.out.println("MyClass의 display 메서드");
    }

    public static void main(String[] args) {
        MyClass myclass1 = new MyClass();
        InterfaceA myclass2 = new MyClass();
        InterfaceB myclass3 = new MyClass();

        myclass1.display();
        myclass2.display();
        myclass3.display();
    }
}
