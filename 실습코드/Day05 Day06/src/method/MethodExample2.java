package method;

public class MethodExample2 {
    // 반환값이 없는 메서드
    public void sum(int a, int b) {
        System.out.println(a + b); // 두 수의 합을 출력만 할 수 있음
    }
    
    // 반환값이 있는 메서드
    public int sum2(int a, int b) {
        return a + b; // 합을 반환
    }

    public static void main(String[] args) {
        MethodExample2 example = new MethodExample2();
        
        // 반환 값이 없으므로 결과를 바로 출력
        example.sum(10, 20);

        // 결과를 반환 받아서 출력
        System.out.println(example.sum2(20, 30));

        // 호출 후 반환 값을 변수에 저장
        int result = example.sum2(1, 2);
    }
}
