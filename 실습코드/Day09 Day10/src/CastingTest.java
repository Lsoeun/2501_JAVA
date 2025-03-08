public class CastingTest {
    public static void main(String[] args) {
        Animal2 hAnimal = new Human();
        if (hAnimal instanceof Human) { // hAnimal 인스턴스의 자료형이 Human 이라면
            Human human = (Human) hAnimal; // hAnimal 인스턴스의 자료형을 Human 형으로 다운캐스팅
        }

        // 새로운 문법 등장
        Animal2 hAnimal2 = new Human();
        if (hAnimal2 instanceof Human human) {
            // 여기서 자동으로 Human 타입으로 다운캐스팅
        }
    }
}
