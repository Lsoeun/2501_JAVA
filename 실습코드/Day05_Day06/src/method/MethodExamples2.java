package method;

public class MethodExamples2 {

    // 반환 값이 없는 메서드: 결과를 바로 출력
    public void sum(int a, int b) {
        System.out.println(a + b);  // 합을 출력만 할 수 있음
    }

    // 반환 값이 있는 메서드: 계산 결과를 반환
    public int sum2(int a, int b) {
        return a + b;  // 합을 반환
    }

    public static void main(String[] args) {
        // MethodExamples2 클래스의 객체를 생성
        MethodExamples2 example = new MethodExamples2();

        // sum() 호출: 반환 값이 없으므로 결과를 바로 출력
        example.sum(10, 6);

        // sum2() 호출: 결과를 반환받아 출력
        System.out.println(example.sum2(10, 6));

        // sum2() 호출 후 반환 값을 변수에 저장
        int result = example.sum2(10, 6);  // sum2의 반환 값을 result에 저장
        System.out.println(result);
    }
}