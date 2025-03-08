public class Quiz4 {
    // 주어진 정수 n 까지의 합을 반복문으로 계산하여 출력하세요.
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i
        }

        System.out.println("1부터" + n + "까지의 합 : " + sum);
    }
}
