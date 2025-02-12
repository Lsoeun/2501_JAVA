public class Employee {
    public void work() {
        System.out.println("직원이 일합니다.");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("관리자가 직원들을 관리합니다.");
    }

    public void holdMeeting() {
        System.out.println("관리자가 회의를 주최합니다.");
    }
}
