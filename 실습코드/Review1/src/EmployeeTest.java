public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("=== Employee 객체 ===");
        Employee employee = new Employee();
        employee.work();
        System.out.println();

        System.out.println("=== Manager 객체 업캐스팅 ===");
        Employee mgr = new Manager();
        mgr.work();
        System.out.println();

        System.out.println("=== Manager 객체 다운캐스팅 ===");
        if (mgr instanceof Manager) {
            Manager manager = (Manager) mgr;
            manager.work();
            manager.holdMeeting();
        }
    }
}
