public class StudentTest2 {
    public static void main(String[] args) {
        System.out.println(Student1.serialNum); // static 변수를 클래스 이름으로 접근

        Student1 student = new Student1();
        System.out.println(student.serialNum); // static 변수를 참조변수를 통해 접근
    }
}
