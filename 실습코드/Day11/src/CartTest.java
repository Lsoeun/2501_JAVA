public class CartTest {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car suv = new Suv();
        Car sportCar = new SportCar();

        System.out.println(sedan.move());
        System.out.println(suv.move());
        System.out.println(sportCar.move());
    }
}
