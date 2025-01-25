// break 사용 예제
public class Ex14 {
    public static void main(String[] args) {
        int i = 1;

        // 1부터 10까지 숫자 출력, 7을 만나면 종료
        while (i <= 10) {
            if (i == 7) {
                break;  // 7을 만나면 반복문 종료
            }
            System.out.println(i);  // 1부터 6까지 출력
            i++;
        }
    }
}
