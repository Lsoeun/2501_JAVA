public class IntegerEx {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(1000); // 1000을 가진 Integer 객체 생성
        System.out.println(num);
        System.out.println(num.intValue()); // 객체에서 값 가지고 오기

        // num.value = 200; value가 final로 선언되어 있어서 변경 불가
        // Integer 객체의 내부 값은 변경 불가

        Integer number1 = Integer.valueOf(100); // Integer 객체 생성
        Integer number2 = Integer.valueOf("100"); // Integer 객체 생성
        // valueOf()를 사용하면, 필요한 경우에만 새로운 객체가 생성되고, 동일한 값의 객체는 재사용
        System.out.println(number1 == number2);
        Integer number3 = Integer.valueOf(100);
        System.out.println(number1 == number3);

        int num2 = Integer.parseInt("100"); // 문자열 "100"을 int로 변환
    }
}
