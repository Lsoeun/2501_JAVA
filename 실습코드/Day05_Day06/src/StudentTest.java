public class StudentTest {
    public static void main(String[] args) {
        Student2 studentAhn = new Student2(); // Student 클래스 생성
        studentAhn.studentName = "안승연";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
