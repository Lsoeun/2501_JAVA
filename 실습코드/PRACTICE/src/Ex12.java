// 중첩된 for문 연습 예제
public class Ex12 {
    public static void main(String[] args) {
        // 중첩 for문으로 숫자를 이용한 패턴 출력
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);  // 숫자 출력
            }
            System.out.println();  // 한 줄 끝날 때마다 줄 바꿈
        }
    }
}
