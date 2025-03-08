public class Dog extends Animal {
    // Animal 클래스를 상속받는다.
    String dogName;

    // 기능 추가
    public void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }

    public void fetch(String item) {
        System.out.println("강아지가" + item + "을 가지고 옵니다.");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println("강아지가 소리를 냅니다."+ sound);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
        dog.makeSound("멍멍");
        dog.eat();
        dog.fetch("공");

        Animal dog2 = new Dog();
        dog2.makeSound("왈왈");
        dog2.eat();
        // dog2.sleep(); // Dog 클래스에 추가로 정의한 sleep메서드는 Aniaml 타입으로 Dog 객체를 생성하면 사용 불가
        // dog2.fetch(); // 사용 불가

        Animal animal = new Animal();
        animal.makeSound("안녕");
    }
}
