public class ParentTest {
    public static void main(String[] args) {
        Parent parent = new Child();

        if (parent instanceof Child) {
            Child child = (Child) parent; // 다운캐스팅
            child.show();
        }
    }
}
