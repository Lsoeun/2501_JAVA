public class CarCar {
    String color; // 색상
    int speed; // 속도
    
    // 기본 생성자 : 색상과 속도를 우리가 원하는 기본값으로 설정
    public CarCar() {
        this.color = "검정"; // 기본 색상
        this.speed = 100; // 기본 속도
    }
    
    // 매개변수를 받는 생성자 : 색상만 설정
    public CarCar(String color){
        this.color = color; // 주어진 색상으로 color 설정
        this.speed = 0; // 기본 속도는 0으로 설정
    }
    
    // 매개변수를 받는 생성자 : 색상과 속도를 모두 설정
    public CarCar(String color, int speed) {
        this.color = color; // 매개변수로 주어지는 색상으로 color 설정
        this.speed = speed; // 매개변수로 주어지는 속도로 speed 설정
    }

    // 자동차 정보를 출력하는 메서드
    public void displayInfo() {
        System.out.println("자동차 색상: " + color);
        System.out.println("자동차 속도: " + speed);
    }

    public static void main(String[] args) {
        // 매개변수를 받지 않는 기본 생성자 호출
        CarCar car1 = new CarCar();
        car1.displayInfo();
        // 색상 - 검정, 속도 - 100
        
        // 색상만 설정하는 생성자 호출
        CarCar car2 = new CarCar("파랑");
        car2.displayInfo();
        // 색상 - 파랑, 속도 - 0

        // 색상과 속도를 모두 설정하는 생성자 호출
        CarCar car3 = new CarCar("빨강", 100);
        car3.displayInfo();
        // 색상 - 빨강, 속도 - 100
    }
}
