import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator it = list.iterator();
        // list.iterator()를 호출하여 이터레이터 객체를 생성

        while(it.hasNext()) {
            Object i = it.next();
            System.out.println(i);
        }
    }
}
