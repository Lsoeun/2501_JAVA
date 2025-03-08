public class Animal {
    // 속성
    String name;

    // 기능
    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(String sound) {
        System.out.println("동물이 소리를 냅니다." + sound);
    }

    public void eat() {
        System.out.println("동물이 먹습니다.");
    }
}
