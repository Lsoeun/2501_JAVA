package method;

public class MethodExamples {

    // 매개변수와 반환값이 있는 메서드: 두 수의 합에 2를 더한 결과를 반환
    public int sum(int a , int b) {
        int result = a + b + 2;  // 두 수의 합에 2를 더함
        return result;  // 계산된 결과를 반환
    }

    // 매개 변수는 있으나 반환값이 없는 메서드: 두 수의 합을 출력만 하고 반환하지 않음
    public void sumPrint(int a, int b) {
        int result = a + b;  // 두 수의 합 계산
        System.out.println(result);  // 합을 출력
    }

    // 매개 변수는 없고 반환값이 있는 메서드(String)
    public String getName() {
        return "홍길동";  // 문자열 "홍길동"을 반환
    }

    // 매개변수와 반환값이 모두 없는 메서드
    public static void todayWeather() {
        System.out.println("오늘의 날씨는 맑음");  // 고정된 날씨 출력
    }

    public static void main(String[] args) {
        // MethodExamples 클래스의 객체 생성
        MethodExamples example = new MethodExamples();

        // sum() 호출 후 변수에 담아서 결과 출력
        int resultSum = example.sum(10, 5);
        System.out.println(resultSum);

        // sumPrint() 호출: 반환값이 없으므로 바로 출력
        example.sumPrint(10, 5);

        // getName() 호출 후 변수에 담아서 결과 출력
        String name = example.getName();
        System.out.println(name);

        // todayWeather() 호출: 반환값이 없고 바로 출력됨
        todayWeather();
    }
}