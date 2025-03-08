public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.month = 10000;
        date.day = 200000;
        date.year = 2;
        // 접근이 제한되지 않으므로 정보의 오류가 발생할 수 있음
    }
}
