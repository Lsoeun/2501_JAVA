package A;

public class Example {
    // public 필드 : 어디서나 접근 가능
    public String publicField = "public Field";
    
    // protected 필드 : 같은 패키지 또는 상속 받은 클래스에서 접근 가능
    protected String protectedField = "Protected Field";
    
    // default 필드 : 같은 패키지에서만 접근 가능
    String defaultField = "Default Field";
    
    // private 필드 : 해당 클래스 내부에서만 접근 가능
    private String privateField = "Private Field";

    public String getPrivateField() {
        // private 필드에 접근할 수 있는 메서드
        return privateField;
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.publicField = "접근 가능";
        example.protectedField = "접근 가능";
        example.defaultField = "접근 가능";
        example.privateField = "접근 가능";
    }
}
