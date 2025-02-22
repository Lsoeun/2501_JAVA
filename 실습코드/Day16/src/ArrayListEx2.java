import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    // 데이터 삭제
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 2의 배수 삽입
        for(int i = 1; i < 10; i++) {
            int temp = 2 * i;
            list.add(temp);
        }
        System.out.println("리스트 값: " + list);

        // 3번째 인덱스의 값 삭제
        list.remove(3);
        // 숫자 타입의 데이터는 인덱스와 구별을 위해 객체를 선언하여 삭제
        list.remove(Integer.valueOf(10));

        System.out.println("삭제 후 리스트 값: " + list);

        List<String> list2 = new ArrayList<>();

        // 문자열 추가
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        System.out.println("리스트 값: " + list2);

        // 특정 인덱스의 값 삭제
        list2.remove(2); // 2번째 인덱스 삭제 ("Cherry")
        System.out.println("2번째 인덱스 삭제 후: " + list2);

        // 특정 값을 삭제
        list2.remove("Banana"); // "Banana" 삭제
        System.out.println("특정 값 삭제 후: " + list2);
    }
}
