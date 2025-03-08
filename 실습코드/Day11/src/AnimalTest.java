public class AnimalTest {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 에러! 추상 클래스는 인스턴스화 할 수 없음!!!

        // 하위 클래스로 인스턴스 생성
        Cat cat = new Cat();
        // 메서드 호출
        cat.sound(); // 재정의한 메서드 호출
        cat.eat();

        Animal cat2 = new Cat();
        cat2.eat();
        cat2.sound(); // 재정의한 메서드 호출
    }
}
