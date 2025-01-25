// 조건의 참과 거짓에 상관 없이 일단 한 번은 실행하는 do-while 예제
public class Ex10 {
    public static void main(String[] args) {
        int count = 101;  // count가 이미 101이라 처음부터 조건이 거짓

        // do-while문은 최소한 한 번은 실행
        do {
            System.out.println("현재 카운트: " + count);
            count++;  // 카운트를 증가시키기
        } while (count <= 100);  // 조건이 거짓이므로 반복문이 종료

        System.out.println("카운트가 100을 초과하여 반복이 종료되었습니다.");
    }
}
