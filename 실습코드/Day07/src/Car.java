public class Car {
    // 자동차의 속성을 나타내는 멤버 변수
    String color; // 색상
    int speed; // 속도
    
    // 생성자 : Car 객체 생성 시 색상과 속도를 정해줌
    public Car(String carColor, int carSpeed) {
        color = carColor;
        speed = carSpeed;
    }

    // 기본 생성자
    public Car() {
        this.color = "검정"; // 기본 색상 설정
        this.speed = 10; // 기본 속도 설정
    }

    // 매개변수를 받는 생성자: 색상만 설정
    public Car(String color) {
        this.color = color;
    }

    // 자동차의 정보를 보여주는 메서드
    public void displayInfo() {
        System.out.println("자동차 색상: " + color);
        System.out.println("자동차 속도: " + speed);
    }
}
