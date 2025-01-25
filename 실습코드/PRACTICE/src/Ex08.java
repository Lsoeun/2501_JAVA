// while문 연습 예제
public class Ex08 {
    public static void main(String[] args) {
        int count = 1;  // 인사 횟수

        // 5번 인사하기
        while (count <= 5) {
            System.out.println(count + "번째 인사: 안녕하세요!");
            count++;  // 인사 횟수 증가
        }

        System.out.println("인사를 마쳤습니다!");
    }
}
