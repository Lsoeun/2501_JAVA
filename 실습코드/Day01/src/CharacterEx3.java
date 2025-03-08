public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65; // 가능
        // char b2 = -66; // 불가능
        // 문자형 변수에 음수를 넣으면 오류가 발생!!

        System.out.println((char)a);
        System.out.println((char)b); // 음수는 char로 변환할 수 없으므로 잘못된 값이 나옴
        System.out.println(a2);
    }
}
