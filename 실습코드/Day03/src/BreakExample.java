public class BreakExample {
    // 반복문에서 break 문을 사용하면 그 지점에서 더이상 수행문을 반복하지 않고 반복문을 빠져나갑니다.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // i가 5일때 반복문을 종료하고 빠져나감
            }
            System.out.println(i);
        }
    }
}
