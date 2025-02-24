public class OuterClass4 {
    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i) { // 외부 클래스의 메서드. 매개변수 상수로 바뀜
        int num = 100; // 지역변수 -> 상수로 바뀜

        class MyRunnable implements Runnable { // 지역 내부 클래스
            int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                //num = 200; 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                //i = 100; // 매개변수도 상수로 바뀌므로 값을 변경할 수 없어 오류 발생

                System.out.println("i = " + i); // 외부 클래스 메서드의 매개변수
                System.out.println("num = " + num); // 외부 클래스 메서드의 지역변수
                System.out.println("localNum = " + localNum); // 지역 내부 클래스의 인스턴스 변수
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + OuterClass4.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }
}
