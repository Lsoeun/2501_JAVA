public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = new Customer();
        Sell seller = new Customer();

        customer.buy();
        customer.sell();

        System.out.println();
        customer.order();
        buyer.order();
        seller.order();
        System.out.println();

        buyer.buy(); // buyer는 Buy 인터페이스의 메서드만 호출 가능

        seller.sell(); // seller는 Sell 인터페이스의 메서드만 호출 가능

        // 다운캐스팅
        if (seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.sell();
            customer2.buy();
        }
    }
}
