public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1() { // 생성자
        serialNum++; // 학생이 생성될 때마다 증가
        studentID = serialNum;  // 증가된 값을 학번 인스턴스 변수에 대입
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
