public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;

    public Student1() { // 생성자
        serialNum++; // 학생 객체가 생성될 때마다 serialNum 값이 증가
        studentID = serialNum;
    }
}
