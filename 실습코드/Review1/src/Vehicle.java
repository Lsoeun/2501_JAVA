public class Vehicle {
    public void move() {
        System.out.println("차량이 이동합니다.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        super.move();
        System.out.println("자동차가 도로를 달립니다.");
    }
}
