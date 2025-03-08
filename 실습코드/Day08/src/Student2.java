public class Student2 {
    private static int serialNum = 1000;
    public int studentID;
    private String studentName;
    public int grade;

    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        int i = 10; // static 변수 내부에 지역변수를 만드는 것은 가능
        Student2.serialNum = serialNum;
        // grade = 1; // 오류 발생 -> 인스턴스 변수이기 때문!!
        // 인스턴스 변수는 static 메서드 내부에서 사용 불가!!
        Student2.serialNum = 2000; // serialNum은 static 변수이므로 static 메서드 내부에서 사용 가능!!
    }
}
