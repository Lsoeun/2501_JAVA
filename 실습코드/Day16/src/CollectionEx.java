import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
    public static void main(String[] args) {
        Collection<String> fruit = new ArrayList<>();
        // Collection인터페이스의 구현체로 ArrayList를 사용
        // ArrayList를 사용하여 Collection 타입의 객체를 생성

        // 컬렉션에 요소 추가
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");

        // 요소 갯수 출력
        System.out.println("fruit의 요소 갯수" + fruit.size());

        // 특정 요소의 포함 여부 확인
        if (fruit.contains("banana")) {
            System.out.println("바나나가 있습니다.");
        }

        // 요소 제거
        fruit.remove("orange");
        System.out.println(fruit.size());

        // 컬렉션이 비어 있는지 확인
        if (!fruit.isEmpty()) {
            System.out.println("컬렉션이 비어 있지 않습니다.");
        }

        // 컬렉션의 모든 요소 출력 (향상된 for문 사용)
        for (String f : fruit) {
            System.out.println(f);
        }

        // 컬렉션의 모든 요소 제거
        fruit.clear();
        System.out.println(fruit.size());
    }
}
