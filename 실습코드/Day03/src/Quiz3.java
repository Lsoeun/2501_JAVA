public class Quiz3 {
    // 주어진 숫자(2~9)에 해당하는 구구단을 반복문으로 출력하세요.
    public static void main(String[] args) {
        int dan = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "X" + i + "=" + dan * i);
        }
    }
}
