public class BankAccount {
    // 정보 은닉을 위한 private 필드
    private String accountNumber;
    private int balance;

    // 생성자: 계좌 번호와 초기 잔액을 설정
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 입금 메서드: amount만큼 입금 후 잔액 출력
    public void deposit(int amount) {
        balance += amount;
        System.out.println("입금 후 잔액: " + balance + "원");
    }

    // 출금 메서드: amount만큼 출금 후 잔액 출력
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족: 출금 실패");
        } else {
            balance -= amount;
            System.out.println("출금 후 잔액: " + balance + "원");
        }
    }

    // 현재 잔액을 반환하는 메서드 (정보 은닉을 위한 getter 메서드)
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // BankAccount 객체 생성
        BankAccount account = new BankAccount("123-456-789", 100000);

        // 입금 테스트
        account.deposit(50000);

        // 출금 테스트
        account.withdraw(30000);

        // 출금 실패 테스트 (잔액 부족)
        account.withdraw(200000);

        // 현재 잔액 출력
        System.out.println("현재 잔액: " + account.getBalance() + "원");
    }
}
