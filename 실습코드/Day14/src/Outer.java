public class Outer {
    private int outerField = 10;  // 외부 클래스의 필드

    public void outerMethod() {   // 외부 클래스의 메서드
        System.out.println("외부 클래스의 메서드");
    }

    public void createInner() {
        Inner inner = new Inner();  // 내부 클래스 객체 생성
        inner.accessOuter();        // 내부 클래스의 메서드 호출
        inner.innerField = 30; // 내부 클래스의 필드 접근
    }

    class Inner { // 내부 클래스
        private int innerField = 20; // 내부 클래스의 필드

        public void accessOuter() {
            // 내부 클래스에서 외부 클래스의 필드와 메서드에 접근
            System.out.println("외부 클래스 필드 접근: " + outerField);
            outerMethod();  // 외부 클래스의 메서드 호출
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(); // 외부 클래스 객체 생성
        outer.createInner();  // 외부 클래스 메서드 호출
        Outer.Inner inner = outer.new Inner(); // 외부 클래스 객체를 통해 내부 클래스 객체 생성
        inner.accessOuter();  // 내부 클래스 메서드 호출
    }
}

// 인스턴스 내부 클래스는 외부 클래스의 인스턴스 멤버(필드 및 메서드)에 직접 접근할 수 있음
// 외부 클래스의 객체를 명시적으로 참조할 필요 없이, 외부 클래스의 인스턴스 멤버에 접근할 수 있는 이유는 내부 클래스가 외부 클래스의 인스턴스와 암묵적으로 연결되어 있기 때문!
// 외부 클래스에서 내부 클래스의 멤버에 접근하려면 내부 클래스의 객체를 먼저 생성해야 함
// 외부 클래스에서 내부 클래스의 객체를 생성한 후 그 객체를 통해 내부 클래스의 필드나 메서드에 접근할 수 있음