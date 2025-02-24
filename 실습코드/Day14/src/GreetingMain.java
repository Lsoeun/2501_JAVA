public class GreetingMain {
    public static void main(String[] args) {
        // 첫 번째 객체 생성
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("첫 번째 객체: 안녕하세요!");
            }
        };

        // 두 번째 객체 생성
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("두 번째 객체: 반갑습니다!");
            }
        };

        // greeting1 객체 사용
        greeting1.sayHello();  // "첫 번째 객체: 안녕하세요!"

        // greeting2 객체 사용
        greeting2.sayHello();  // "두 번째 객체: 반갑습니다!"

        greeting1.sayHello(); // 생성된 greeting1 객체를 통해 계속해서 메서드 호출 가능
    }
}
