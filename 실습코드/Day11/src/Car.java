public abstract class Car {
    public abstract String move();
}

class Sedan extends Car {
    @Override
    public String move() {
        return "세단이 도로를 따라 주행합니다.";
    }
}

class Suv extends Car{
    @Override
    public String move() {
        return "SUV가 험한 길을 달립니다.";
    }
}

class SportCar extends Car {
    @Override
    public String move() {
        return "스포츠카가 빠르게 달려갑니다.";
    }
}
