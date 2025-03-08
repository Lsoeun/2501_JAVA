public class OverrideTest {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 업캐스팅
        // dog.sleep(); -> 하위 클래스에 추가로 정의한 메서드는 호출할 수 없음(Animal 형이므로)
        // dog.fetch(); -> 하위 클래스에 추가로 정의한 메서드는 호출할 수 없음(Animal 형이므로)
        dog.makeSound("멍멍"); // 하위 클래스에서 오버라이딩 한 메서드는 접근 가능 -> 재정의 된 메서드가 호출
        dog.eat(); // 상위 클래스의 메서드는 접근 가능
        dog.name = "개"; // 상위 클래스의 변수 접근 가능
        // dog.dogName = "강아지"; -> 하위 클래스에서 추가로 정의한 멤버변수는 접근 할 수 없음(Animal 타입이므로)


        Dog dog2 = new Dog();
        dog2.sleep(); // 하위 클래스에서 추가로 정의한 메서드 접근 가능
        dog2.fetch("공"); // 하위 클래스에서 추가로 정의한 메서드 접근 가능
        dog2.makeSound("왈왈"); // 오버라이딩한 메서드 접근 가능 -> 재정의된 메서드 호출
        dog2.dogName = "치와와"; // 하위 클래스에서 추가로 정의한 변수 접근 가능
        dog2.eat(); // 상위 클래스 메서드 접근 가능
        dog2.name = "비숑"; // 상위 클래스 변수 접근 가능


        Animal animal = new Animal();
        // Dog animal2 = new Animal(); -> 불가능!!
        animal.name = "동물";
        animal.eat();
        animal.makeSound("으르렁"); // 재정의 되지 않은 Animal 클래스에 있는 makeSound로 호출
        // animal.sleep(); -> 하위클래스에서 추가로 정의한 메서드 접근 불가
        // animal.fetch(); -> 하위클래스에서 추가로 정의한 메서드 접근 불가
        // animal.dogName = "불독"; -> 하위 클래스에서 추가로 정의한 변수 접근 불가
        // 왜?? Animal 타입이니까 + Animal 객체니까!
    }
}
