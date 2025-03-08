public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for(num = 1; num <= 100; num++) { // 100까지 반복
            if (num % 2 == 0) { // num의 값이 짝수인 경우
                continue; // 이후 수행을 생략하고 num++을 수행
            }

            total += num; // total = total + num
            // num값이 홀수인 경우에만 수행
        }

        System.out.println("1부터 100까지 홀수의 합은: " + total + "입니다.");
    }
}
