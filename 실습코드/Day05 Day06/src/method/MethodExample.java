package method;

// 매개변수와 반환값의 유무에 따라서 함수는 4가지 유형으로 나눌 수 있음
public class MethodExample {
    // 매개변수도 있고 반환값도 있는 메서드
    public int sum(int a , int b) {
        int result = a + b;
        return result; // 계산된 결과를 반환
    }

    // 매개변수는 있으나 반환값이 없는 메서드
    public void sumPrint(int a, int b) {
        int result = a + b;
        System.out.println(result); // 두 수의 합을 출력
    }
    
    // 매개변수는 없고 반환값이 있는 메서드
    public String getName(){
        return "홍길동"; // 문자열 홍길동을 반환
    }

    // 매개변수와 반환값이 모두 없는 메서드
    public void todayWeather() {
        System.out.println("오늘의 날씨는 맑음"); // 고정된 멘트 출력
    }

    public static void main(String[] args) {
        // MethodExample 객체 생성
        MethodExample example = new MethodExample();
        
        // 매개변수도 있고 반환값도 있는 메서드
        int resultSum = example.sum(10, 5);
        System.out.println(resultSum); // sum() 함수 호출 후 변수에 담아서 결과 출력

        // 매개변수는 있고 반환값은 없는 메서드
        example.sumPrint(10, 20);

        // 매개변수는 없고 반환값은 있는 메서드
        String name = example.getName();
        System.out.println(name);
        System.out.println(example.getName());
        
        // 매개변수도 없고 반환값도 없는 메서드
        example.todayWeather();
    }
}
