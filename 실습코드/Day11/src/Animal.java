// 추상 클래스 선언
public abstract class Animal {
    // 일반 메서드 (구현이 되어 있음)
    public void eat() {
        System.out.println("이 동물은 음식을 먹습니다.");
    }
    // 추상 메서드 (구현하지 않고 선언만 함)
    public abstract void sound();
}

class Cat extends Animal {
    // 오버라이딩을 통해 추상 메서드 구현
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
