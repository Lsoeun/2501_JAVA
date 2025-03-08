public class StringEquals {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 주소값 비교
        System.out.println(str1.equals(str2)); // 논리적 동일성 비교

        Integer i1 = new Integer(1000);
        Integer i2 = new Integer(1000);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
