public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setFruitNo(1000);
        fruit.setFruitName("사과");
        System.out.println(fruit);

        Fruit test = fruit.getself();
        System.out.println(test);
    }
}
