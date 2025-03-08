public class Car extends Vehicle {
    // 생성자
    public Car() {
        super("자전거");
        // 우리가 명시하지 않아도 자바 컴파일러가 자동으로 상위 클래스의 기본 생성자를 호출 해줌
        System.out.println("car 생성자 호출");
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
