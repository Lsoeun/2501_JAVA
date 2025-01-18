public class Student2 {
    // 멤버 변수
    int studentID;
    String studentName;
    int grade;
    String address;

    // 학생 이름을 반환하는 메서드
    public String getStudentName() {
        return studentName;
    }

    // 학생 이름을 설정하는 메서드
    public void setStudentName(String name) {
        studentName = name;
    }

    // main() 함수 : 프로그램의 실행 시작점
    public static void main(String[] args) {
        Student2 studentAhn = new Student2(); // Student2 클래스의 객체를 생성
        studentAhn.studentName = "안연수";  // 객체의 studentName 필드에 값을 할당

        System.out.println(studentAhn.studentName); // studentName에 직접 접근하여 출력
        System.out.println(studentAhn.getStudentName()); // getStudentName() 메서드를 통해 studentName 출력
    }
}