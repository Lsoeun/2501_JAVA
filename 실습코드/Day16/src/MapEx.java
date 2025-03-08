import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        // 요소 추가
        fruitPrices.put("apple", 1000);
        fruitPrices.put("banana", 800);
        fruitPrices.put("orange", 1200);

        // 특정 키의 값 가져오기
        System.out.println(fruitPrices.get("apple"));

        // 맵의 크기 확인(몇개의 요소가 저장되어 있는지 확인)
        System.out.println(fruitPrices.size());

        // 특정 키가 존재하는지 확인
        if (fruitPrices.containsKey("banana")) {
            System.out.println("바나나가 있습니다.");
        }

        // 값 제거
        fruitPrices.remove("orange");
        System.out.println(fruitPrices);

        // 모든 키와 값 출력
        for (String key : fruitPrices.keySet()) {
            System.out.println(key + ":" + fruitPrices.get(key));
        }

        // 맵 비우기
        fruitPrices.clear();
        System.out.println(fruitPrices.size());
    }
}
