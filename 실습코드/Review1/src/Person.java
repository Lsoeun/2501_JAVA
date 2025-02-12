public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다. 학번은 " + studentId + "입니다.");
    }
}
