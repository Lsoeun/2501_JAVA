public class Person2 {
    String name;
    float height;
    float weight;

    // 기본 생성자 직접 구현
    public Person2(){}


    // 사람의 이름을 매개변수로 입력받아서 Person2 객체를 생성하는 생성자
    public Person2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person2 person = new Person2();
        // 자바 컴파일러는 생성자가 하나도 없는 경우에만 디폴트 생성자를 제공함
        // 프로그래머가 직접 생성자를 추가하면 디폴트 생성자는 만들어지지 않음
    }
}
