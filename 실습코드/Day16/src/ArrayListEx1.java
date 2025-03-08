import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    // 내부적으로 배열을 사용하여 구현되어 배열과 호환성이 좋음
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 데이터 삽입
        list.add("딸기");
        list.add("포도");
        list.add("망고");

        // 리스트 출력
        System.out.println("리스트 내용" + list);

        // 3번째 위치에 삽입
        list.add(2, "수박");

        System.out.println(list);

        // 데이터 변경
        list.set(1, "복숭아");
        list.set(0, "바나나");

        System.out.println(list);
    }
}
