import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        // TreeSet 객체 생성 (정렬된 순서로 데이터를 저장하는 Set)
        Set set = new TreeSet();

        // TreeSet에 랜덤한 숫자 6개를 추가하는 반복문
        for(int i = 0; set.size() < 6; i++) {
            // Math.random()을 사용하여 1부터 45 사이의 랜덤 숫자 생성
            int num = (int)(Math.random() * 45) + 1;
            // 생성된 숫자가 이미 set에 존재하지 않으면 자동으로 추가됨(중복 허용하지 않기 때문)
            set.add(num);
        }

        // set에 저장된 값을 출력 (TreeSet은 자동으로 기본 오름차순 정렬되어 출력됨)
        System.out.println(set);
    }
}

// Math.random()은 0.0 이상 1.0 미만의 임의의 실수(double 타입)를 반환
// Math.random() * 45는 0.0 이상 45.0 미만의 실수가 됨
// (int)(Math.random() * 45)는 0 이상 44 이하의 정수를 만들기 위한 형 변환
// 마지막으로 + 1을 더해주면, 1부터 45 사이의 정수가 됨(0부터 시작하므로)