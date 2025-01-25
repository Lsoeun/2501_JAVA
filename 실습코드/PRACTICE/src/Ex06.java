// if-else if-else 연습 예제
public class Ex06 {
    public static void main(String[] args) {
        int hours = 4;  // 주차 시간
        int fee;        // 주차 요금을 저장할 변수

        if (hours <= 1) {
            fee = 2000;  // 1시간 이하: 2000원
        } else if (hours <= 3) {
            fee = 4000;  // 2~3시간: 4000원
        } else if (hours <= 6) {
            fee = 6000;  // 4~6시간: 6000원
        } else {
            fee = 8000;  // 6시간 초과: 8000원
        }

        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
