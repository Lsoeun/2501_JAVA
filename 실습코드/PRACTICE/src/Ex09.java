// 특정 조건이 만족될 때까지 반복하는 while문 예제
public class Ex09 {
    public static void main(String[] args) {
        int count = 1;  // 카운트를 1부터 시작

        // 무한 반복 (특정 조건이 만족될 때까지 반복)
        while (true) {
            System.out.println("현재 카운트: " + count);
            count++;  // 카운트 증가

            // count가 30을 초과하면 반복 종료
            if (count > 30) {
                break;  // 반복 종료
            }
        }

        System.out.println("카운트가 30을 초과했습니다. 프로그램 종료!");
    }
}
