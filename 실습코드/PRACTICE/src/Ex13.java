// continue 사용 예제
public class Ex13 {
    public static void main(String[] args) {
        // 1부터 20까지 숫자 중 4의 배수는 건너뛰고 나머지 숫자 출력
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue;  // 4의 배수는 건너뛰기
            }
            System.out.println(i);  // 4의 배수가 아닌 숫자 출력
        }
    }
}
