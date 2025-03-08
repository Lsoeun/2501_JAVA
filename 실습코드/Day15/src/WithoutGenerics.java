import java.util.ArrayList;
import java.util.List;

// 지네릭을 사용하지 않는 경우
public class WithoutGenerics {
    public static void printIntegerList(List list) {
        for (Object item : list) {
            // Object에서 Integer로 다운캐스팅
            Integer number = (Integer) item; // 잘못된 타입이 들어오면 오류 발생 가능
            System.out.println(number);
        }
    }

    public static void printStringList(List list) {
        for (Object item : list) {
            // Object에서 String으로 다운캐스팅
            String text = (String) item; // 잘못된 타입이 들어오면 오류 발생 가능
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add("4");

        List strings = new ArrayList();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        System.out.println("IntegerList");
        printIntegerList(numbers);

        System.out.println("StringList");
        printStringList(strings);
    }
}
