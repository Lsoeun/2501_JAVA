import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("사과", 1000);
        fruitPrice.put("바나나", 2000);

        // 키를 통해 값에 접근
        System.out.println(fruitPrice.get("사과"));
        System.out.println(fruitPrice.get("바나나"));
    }
}
