public class GreetingMain {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting(){
            @Override
            public void sayHello() {
                System.out.println("첫번째 객체 : 안녕하세요!!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("두번째 객체 : 반갑습니다!!");
            }
        };

        greeting1.sayHello();
        greeting2.sayHello();
        greeting1.sayHello();
    }
}
