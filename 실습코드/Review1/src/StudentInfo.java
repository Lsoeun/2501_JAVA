public class StudentInfo {
    String name;
    int age;
    double score;

    // 생성자: 이름, 나이, 점수를 받아 초기화
    public StudentInfo(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 학생 정보 출력 메서드
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("점수: " + score + "점");
        System.out.println();
    }

    // 점수 변경 메서드
    public void updateScore(double newScore) {
        this.score = newScore;
        System.out.println("점수가 업데이트되었습니다.");
    }

    public static void main(String[] args) {
        // Student 객체 생성 및 초기화
        StudentInfo student = new StudentInfo("김학생", 15, 85.5);

        // 기존 학생 정보 출력
        System.out.println("=== 학생 정보 ===");
        student.displayInfo();

        // 점수 변경
        student.updateScore(90.0);

        // 변경된 학생 정보 출력
        System.out.println("=== 점수 수정 후 ===");
        student.displayInfo();
    }
}
