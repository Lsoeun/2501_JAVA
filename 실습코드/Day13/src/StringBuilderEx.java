public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", HI"); // 문자열 추가
        System.out.println(sb);
    }
}
// 동시작업이 일어나면 문제가 발생할 수 있음. 대신 속도는 조금 더 빠르다.