public class OuterClass4 { // 외부 클래스
    int outNum = 100; // 외부 클래스의 인스턴스 변수
    static int sNum = 200; // 외부 클래스의 정적 변수

    public Runnable getRunnable(int i) { // 외부 클래스의 메서드
        int num = 100; // 외부 클래스 메서드의 지역변수

        class MyRunnable implements Runnable { // 지역 내부 클래스
            int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                // num = 200; 메서드의 지역 변수는 상수로 바뀌므로 값을 변경할 수 없음
                // i = 200; 메서드의 매개변수도 상수로 바뀌므로 값을 변경할 수 없음
                System.out.println(i + "외부 클래스 메서드의 매개변수");
                System.out.println(num + "외부 클래스 메서드의 지역변수");
                System.out.println(localNum + "지역내부 클래스의 인스턴스 변수");
                System.out.println(outNum + "외부 클래스의 인스턴스 변수");
                System.out.println(sNum + "외부 클래스의 정적 변수");
            }
        }
        return new MyRunnable();
    }

    public static void main(String[] args) {
        OuterClass4 out = new OuterClass4(); // 외부 클래스 객체 생성
        Runnable runner = out.getRunnable(10); // 외부 클래스 메서드 호출
        runner.run();
    }
}
