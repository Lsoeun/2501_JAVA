public class Logical2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag); // flag는 true

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag); // flag는 false

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag); // flag true
    }
}
