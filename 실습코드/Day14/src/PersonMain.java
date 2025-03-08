public class PersonMain {
    Person person = new Person(){
        @Override
        public void eat() {
            System.out.println("eat!!");
        }

        @Override
        public void sleep() {
            System.out.println("sleep!!");
        }
    };

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();
        personMain.person.eat(); // 메서드 호출
    }
}
