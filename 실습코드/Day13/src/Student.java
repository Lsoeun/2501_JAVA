public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "학번:" + studentID + ", 학생 이름: " + studentName;
    }

    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if (studentLee == studentLee2) {
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) {
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 동일하지않습니다.");
        }

        if (studentLee == studentSang) {
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentSang)) {
            System.out.println("studetLee와 studentSang은 동일합니다.");
        } else {
            System.out.println("studentLee와 stduentSang은 동일하지 않습니다.");
        }
    }
}
