package lambda;

@FunctionalInterface
public interface IAdd {
    int add(int x, int y); // 단 하나의 추상 메서드
    // 디폴트, private
}
