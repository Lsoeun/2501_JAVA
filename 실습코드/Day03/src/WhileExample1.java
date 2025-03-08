public class WhileExample1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 10) { // num의 값이 10보다 작거나 같은 동안 반복
            sum += num; // sum = sum + num
            num++; // num에 1씩 더해 나감
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        System.out.println("num의 값은 " + num + "입니다.");
    }
}
