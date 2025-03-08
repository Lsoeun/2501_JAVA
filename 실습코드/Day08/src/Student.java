public class Student {
    public static int serialNum = 1000;
    // static 변수는 인스턴스 생성과 관계 없이 먼저 생성
    public int studentID; // 인스턴스 변수
    public String studentName; // 인스턴스 변수
    public int grade; // 인스턴스 변수

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
