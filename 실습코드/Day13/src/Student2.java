import java.util.Objects;

public class Student2 {
    int studentID;
    String studentName;

    public Student2(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "학번:" + studentID + ", 학생 이름: " + studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return studentID == student2.studentID && Objects.equals(studentName, student2.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, studentName);
    }

    public static void main(String[] args) {
        Student2 studentLee = new Student2(100, "이상원");
        Student2 studentLee2 = studentLee;
        Student2 studentSang = new Student2(100, "이상원");

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
