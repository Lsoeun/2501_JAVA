public class StudentTest {
    public static void main(String[] args) {
        Student2 studentAhn = new Student2(); // Student2 클래스의 객체를 생성
        studentAhn.studentName = "안승연"; // 객체의 studentName 필드에 값을 할당

        System.out.println(studentAhn.studentName); // studentName에 직접 접근하여 출력
        System.out.println(studentAhn.getStudentName()); // getStudentName() 메서드를 통해 studentName 출력
    }
}
