public class User {
    private int id;
    protected String account;
    public String password;

    public void printId() {
        System.out.println(this.id);
    }

    public void printAll() {
        this.printId();
        System.out.println(this.account);
        System.out.println(this.password);
    }

    public static void main(String[] args) {
        User user = new User();
        user.id = 1001;
        user.password = "myPassword";
        user.account = "myAccount";
        user.printAll();

        User user2 = new User();
        user2.id = 1002;
        user2.password = "PS";
        user2.account = "AC";
        user2.printAll();
    }
}
