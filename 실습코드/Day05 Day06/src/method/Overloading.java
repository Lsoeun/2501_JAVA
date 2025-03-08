package method;

public class Overloading {
    // 같은 func 이름을 가졌더라도 매개변수가 달라서 메서드 시그니처가 다르기 때문에 다른 메서드로 인식
    
    public void func() {
        System.out.println("시그니처는 func()");
    }

    public void func(int a) {
        System.out.println("시그니처는 func(int a)");
    }
}
