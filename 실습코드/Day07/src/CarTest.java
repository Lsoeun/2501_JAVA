public class CarTest {
    public static void main(String[] args) {
        // 색상은 빨간색이고 속도가 100인 자동차를 만들기
        Car mycar = new Car("빨강", 100);
        mycar.displayInfo();

        // 색상은 파랑이고 속도는 50인 자동차를 만들기
        Car mycar2 = new Car();
        mycar2.displayInfo();

        // 색상만 설정하는 생성자 호출
        Car mycar3 = new Car("노랑");
        mycar3.displayInfo();
    }
}
