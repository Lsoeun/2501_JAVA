public class OuterClass2 { // 외부 클래스
    private int num = 10; // 외부 클래스의 private 변수
    private static int sNum = 20; // 외부 클래스의 static 변수
    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    public OuterClass2() { // 외부 클래스 생성자
        inClass = new InClass(); // 외부 클래스가 생성된 후 내부 클래스 객체 생성
    }

    public void usingClass() { // 외부 클래스 메서드
        inClass.inTest(); // 내부 클래스 메서드 호출
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100; // 내부 클래스의 인스턴스 변수
        static int sInNum = 200; // JDK16부터 인스턴스 내부 클래스 안에 static 멤버 선언 가능

        public void inTest() { // 인스턴스 내부 클래스의 메서드
            System.out.println("외부 클래스의 인스턴스 변수:" + num); // 외부 클래스의 인스턴스 변수 사용 가능
            System.out.println("외부 클래스의 static 변수:" + sNum); // 외부 클래스의 static 변수 사용 가능
            System.out.println("내부 클래스의 인스턴스 변수:" + inNum); // 내부 클래스의 인스턴스 변수
            System.out.println("내부 클래스의 static 변수:" + sInNum); // 내부 클래스의 static 변수
        }

        public static void sTest() { // 내부 클래스의 static 메서드(JDK16부터 가능)
            // System.out.println(num); // static 메서드는 인스턴스 변수를 내부에서 사용 X
            System.out.println(sNum); // 외부 클래스의 static 변수 사용 가능
            // System.out.println(inNum); // 인스턴스 변수 사용 불가
            System.out.println(sInNum); // 내부 클래스의 static 변수 사용 가능
        }
    }

    public static void main(String[] args) {
        OuterClass2 outClass = new OuterClass2(); // 외부 클래스 객체 생성
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
    }
}
