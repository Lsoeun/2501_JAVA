public class IfExample3 {
    // if문만 쓰는 경우와 if - else if문을 쓰는 경우를 비교
    public static void main(String[] args) {
        int age = 5;
        int charge = 0;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
