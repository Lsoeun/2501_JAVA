public class OuterClass5 {
    // 메서드 내부에 익명 내부 클래스를 만드는 방법
    public Runnable getRunnable(int i) { // 외부 클래스의 메서드,
        int num = 100; // 외부 클래스 메서드의 지역변수

        return new Runnable() { // 익명 내부 클래스. Runnable 인스턴스 생성
            @Override
            public void run() {
                // num = 200; -> 지역 변수 상수 처리되므로 변경 불가
                // i = 100; -> 매개변수 상수 처리되므로 변경 불가
                System.out.println(i); // 접근은 가능
                System.out.println(num); // 접근은 가능
            }
        }; // 클래스 끝에 ;을 씀
    }

    // 익명 내부 클래스를 변수에 대입하는 방법
    Runnable runner = new Runnable() { // 익명 내부 클래스를 변수에 대입
        @Override
        public void run() {
            System.out.println("구현된 익명 클래스");
        }
    }; // 클래스 끝에 ;를 끔. (인터페이스나 추상클래스형 변수를 선언하고 인스턴스를 생성해서 대입하는 방법)

    public static void main(String[] args) {
        OuterClass5 out = new OuterClass5(); // 외부 클래스 인스턴스 생성
        Runnable runnable1 = out.getRunnable(10);
        Runnable runnable2 = out.getRunnable(20);
        runnable1.run();
        runnable2.run();
        System.out.println(runnable1 == runnable2); // 메서드 호출 시 다른 객체 생성

        Runnable runnable3 = out.runner;
        Runnable runnable4 = out.runner;
        runnable3.run();
        runnable4.run();
        System.out.println(runnable3 == runnable4); // 동일한 객체를 참조
    }
}
