public class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }

    public static void main(String[] args) {
        // Animal 클래스를 상속받는 익명 내부 클래스
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("멍멍");
            }
        };

        dog.makeSound(); // 출력: 멍멍
    }
}
