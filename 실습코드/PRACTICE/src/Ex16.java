// 배열 선언 후 값 할당 예제
public class Ex16 {
    public static void main(String[] args) {
        // 배열 선언과 크기 지정
        int[] numbers = new int[5];  // 크기가 5인 정수형 배열 선언

        // 배열의 각 요소에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
