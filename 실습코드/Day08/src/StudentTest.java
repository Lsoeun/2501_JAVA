public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("학생1");
        System.out.println(studentLee.serialNum);
        // static 변수 serialNum의 값 출력

        studentLee.serialNum++; // static 변수 값을 증가

        Student studentSon = new Student();
        studentSon.setStudentName("학생2");
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);

        studentSon.serialNum++;
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
