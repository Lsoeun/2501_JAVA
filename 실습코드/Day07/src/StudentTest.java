public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        // studentLee.studentName = "바보"; -> 직접 접근해서 설정 불가능
        studentLee.setStudentName("이이름"); // -> 메서드를 통해서 설정하는 것은 가능

        // System.out.println(studentLee.studentName); -> 직접 접근해서 조회 불가능
        System.out.println(studentLee.getStudentName()); // -> 메서드를 통해서 조회하는 것은 가능
    }
}
