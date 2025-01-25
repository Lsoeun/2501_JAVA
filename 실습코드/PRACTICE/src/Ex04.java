// 자바 연산자 연습 예제
public class Ex04 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;
        int num2 = 3;
        int num3 = 5;

        boolean flag1 = true;
        boolean flag2 = false;

        // 다양한 연산자 활용하여 연산하기
        int result1 = num1 + num2;
        int result2 = result1 * num3;
        boolean result3 = (result1 > num3) && (num2 < num3);
        int result4 = num3++;
        boolean result5 = flag1 || flag2;
        int result6 = (num1 += 5) - (num2 *= 2);

        // 결과 출력
        System.out.println("연산자 연습 결과:");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("num3:" + num3); // num3 값 확인
        System.out.println(result5);
        System.out.println(result6);
    }
}
