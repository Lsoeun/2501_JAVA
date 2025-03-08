public class Animal {
    void makeSound() {
        System.out.println("동물소리~~");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal dog = new Animal(){
            @Override
            void makeSound() {
                System.out.println("멍멍");
            }
        };

        dog.makeSound();
    }
}
