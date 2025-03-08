public class AnimalTest2 {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        Animal2 eagle = new Eagle();
        Animal2 human = new Human();
        Animal2 tiger = new Tiger();

        Animal2 ani = new Animal2();
        ani = new Eagle();
        ani = new Human();
        ani = new Tiger();

        animal.move();
        eagle.move();
        human.move();
        tiger.move();
    }
}
