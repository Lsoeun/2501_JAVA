public class ClassExample {
    public static void main(String[] args) {
        // 1. Object의 getClass() 메서드 활용하기
        String s = new String(); // 빈 문자열 String 객체 생성
        Class c = s.getClass();
        // s가 참조하는 문자열 객체의 클래스 타입 정보를 가져오는 코드
        // getClass() 메서드는 Object에 정의된 메서드. 모든 클래스가 사용 가능
        // 이 메서드를 사용하려면 이미 생성된 인스턴스가 있어야함
        System.out.println(c);

        // 2. 클래스 파일 이름을 Class 타입 변수에 직접 대입하기
        Class c2 = String.class;
        System.out.println(c2);
    }
}
