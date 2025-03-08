import java.util.ArrayList;
import java.util.List;

// 지네릭을 사용하여 처리하는 경우
public class WithGenerics {
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        System.out.println("IntegerList");
        printList(integerList);

        System.out.println("StringList");
        printList(stringList);
    }
}
