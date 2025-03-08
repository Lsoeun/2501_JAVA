import java.util.ArrayList;

public class WrapperClassEx {
    public static void main(String[] args) {
        // 기본 타입
        int number = 5;

        // Wrapper 클래스를 사용한 객체 생성
        Integer i1 = Integer.valueOf(number);
        // int가 Integer로 변환(Wrapper 클래스로 변환)

        // ArrayList에 Wrapper 추가
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i1); // Integer 객체가 ArrayList에 추가

        // null값 사용
        Integer i2 = null; // null 할당 가능
        // int number2 = null; // 기본 타입에는 null 할당 불가능
        System.out.println(i2);
    }
}
