public interface Calc {
    // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
    double PI = 3.14;
    int ERROR = -99999;
    
    // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    
    default void description() { // 디폴트 메서드
        System.out.println("정수 계산기 구현 합니다. 디폴트 메서드");
        myMethod(); // private 메서드 호출 가능
        myStaticMethod(); // private static 메서드 호출 가능
    }
    
    static int total(int[] arr) { // 정적 메서드
        int total = 0; // 지역 변수 선언

        for(int i : arr) {
            total += i;
        }
        myStaticMethod(); // private static 메서드는 호출 가능
        // myMethod(); -> 일반 private 메서드는 호출 불가
        return total;
    }

    // private 메서드
    private void myMethod() {
        System.out.println("private 메서드 입니다.");
    }

    // private static 메서드
    private static void myStaticMethod() {
        System.out.println("private static 메서드 입니다.");
    }
}
