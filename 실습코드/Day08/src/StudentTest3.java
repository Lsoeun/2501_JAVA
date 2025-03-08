public class StudentTest3 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이학생");
        System.out.println(Student2.getSerialNum()); // static 메서드 호출
        System.out.println(studentLee.studentID); // 인스턴스 변수 접근

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손학생");
        System.out.println(Student2.getSerialNum()); // static 메서드 호출
        System.out.println(studentSon.studentID); // 인스턴스 변수 접근
    }
}
