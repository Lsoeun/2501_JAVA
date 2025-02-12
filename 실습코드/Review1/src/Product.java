public class Product {
    String name;
    int price;

    // 생성자
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 상품 정보 출력 메서드
    public void displayInfo() {
        System.out.println("상품명: " + name + ", 가격: " + price + "원");
    }

    public static void main(String[] args) {
        // Product 객체 배열 생성 (크기 3)
        Product[] products = new Product[3];

        // 인덱스를 활용한 객체 초기화
        products[0] = new Product("노트북", 1500000);
        products[1] = new Product("스마트폰", 1000000);
        products[2] = new Product("태블릿", 700000);

        // 배열의 모든 요소 출력
        for (int i = 0; i < products.length; i++) {
            products[i].displayInfo();
        }
    }
}
