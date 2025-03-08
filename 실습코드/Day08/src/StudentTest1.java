public class StudentTest1 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.studentName = "학생1";
        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.studentName = "학생2";
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.studentID);
        System.out.println(Student1.serialNum);
    }
}
