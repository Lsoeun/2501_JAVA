public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", world"); // 문자열 추가
        System.out.println(sb);

        // StrigBuffer는 작업을 안전하게 처리할 수 있지만 속도가 조금 느릴 수 있다.
    }
}
