import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}
