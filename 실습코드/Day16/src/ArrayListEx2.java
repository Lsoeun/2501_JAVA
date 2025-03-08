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
        System.out.println(list);

        list.remove(3); // 3번째 인덱스의 값이 삭제
        System.out.println(list);

        list.remove(Integer.valueOf(10)); // 숫자 타입의 데이터는 인덱스와 구별을 위해 객체를 선언하여 삭제
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("Cherry");
        System.out.println(list2);

        // 특정 인덱스의 값을 삭제
        list2.remove(2); // 2번 인덱스의 값을 삭제

        // 특정 값을 지정해서 삭제
        list2.remove("banana");
        System.out.println("값 삭제 후" + list2);
    }
}
