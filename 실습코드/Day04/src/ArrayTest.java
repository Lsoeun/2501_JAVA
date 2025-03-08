// 배열 선언과 출력 테스트
// 크기가 7인 int 배열의 각 인덱스에 값을 차례대로 1, 2, 3, 4, 5, 6, 7을 넣으세요.
// 배열에 저장된 값을 하나씩 출력하세요.
public class ArrayTest {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7}; // 배열 선언과 동시에 값 할당
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]); // 배열의 값을 하나씩 출력
        }
    }
}
