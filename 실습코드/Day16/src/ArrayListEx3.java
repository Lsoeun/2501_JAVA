import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("Cherry");
        System.out.println(list2);

        // 특정 인덱스의 데이터 가져오기
        String firstFruit = list2.get(0);
        String secondFruit = list2.get(1);

        System.out.println(firstFruit);
        System.out.println(secondFruit);
        System.out.println(list2.get(2));
    }
}
