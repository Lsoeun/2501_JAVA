public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dog2 = new Dog(); // 업캐스팅
        // Animal : 선언된 클래스형
        // Dog : 생성된 인스턴스의 클래스형


        // Dog animal = new Animal(); // 불가능
        Animal animal2 = new Animal();
        // 이유 : 부모 클래스가 자식 클래스의 모든 요소를 포함하지 못하기 때문!
    }
}
