public class Quiz1 {
    // 조건문을 통해 두 개의 정수를 비교하여 더 큰 숫자를 출력하세요.
    // 두 숫자가 같으면 “두 숫자는 같습니다”를 출력합니다.
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        if (num1 > num2) {
            System.out.println("큰 숫자는 = " + num1);
        } else if (num1 < num2) {
            System.out.println("큰 숫자는 = " + num2);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}
