import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person("David", 20));
        set.add(new Person("David", 20));

        System.out.println(set);
    }
}
