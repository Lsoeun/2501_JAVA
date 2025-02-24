public class InnerTest4 {
    public static void main(String[] args) {
        OuterClass5 out = new OuterClass5();

        Runnable runnable = out.getRunnable(10);
        Runnable runnable2 = out.getRunnable(20);
        runnable.run();
        runnable2.run();
        System.out.println(runnable == runnable2); // 메서드 호출 시 다른 객체 생성


        Runnable runner = out.runner;
        Runnable runner2 = out.runner;
        runner.run();
        runner2.run();
        System.out.println(runner == runner2); // 동일한 객체를 참조
    }
}
