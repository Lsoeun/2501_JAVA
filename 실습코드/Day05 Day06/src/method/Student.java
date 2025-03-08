package method;

public class Student {
    // 멤버 변수 = 필드 -> 클래스 내에 선언된 변수
    // 인스턴스 변수 -> 클래스 내부에 선언되며, 인스턴스 생성 시 할당되는 변수
    String name;
    int age;
    public static String schoolName = "서울 고등학교"; // 클래스 변수(static 변수)

    // 메서드
    // 멤버 함수
    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "세입니다.");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student(); // Student 객체 생성 코드
        // student1 = 지역변수이자 참조변수
        student1.name = "홍길동";
        student1.age = 17;

        Student student2 = new Student(); // Student 객체 생성 코드
        // student2 = 지역변수이자 참조변수
        student2.name = "김유진";
        student2.age = 16;

        // 메서드 호출
        student1.introduce();
        student2.introduce();
    }
}
