package 다형성;

public class Animal {
    public void move( ) {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() { // 오버라이딩
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() { // 오버라이딩
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() { // 오버라이딩
        System.out.println("독수리가 하늘을 납니다.");
    }
}
