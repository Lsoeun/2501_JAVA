// 기본 자료형의 형 변환 연습 예제
public class Ex03 {
    public static void main(String[] args) {
        // 묵시적 형 변환 (작은 자료형 -> 큰 자료형)
        int intValue = 100;
        double doubleValue = intValue;

        byte byteValue = 10;
        int intValue2 = byteValue;

        // 명시적 형 변환 (큰 자료형 -> 작은 자료형)
        double doubleValue2 = 123.45;
        int intValue3 = (int)doubleValue2;

        long longValue = 100L;
        short shortValue = (short)longValue;

        // 출력
        System.out.println("형 변환 값:");
        System.out.println("묵시적 형 변환: " + doubleValue);
        System.out.println("묵시적 형 변환: " + intValue2);
        System.out.println("명시적 형 변환: " + intValue3);
        System.out.println("명시적 형 변환: " + shortValue);
    }
}
