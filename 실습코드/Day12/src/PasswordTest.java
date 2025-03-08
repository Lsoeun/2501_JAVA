public class PasswordTest {
    public void validatePassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null값일 수 없습니다.");
        }
        if (password.length() < 5 ) {
            throw new PasswordException("비밀번호는 5자 이상으로 설정해주세요.");
        }
        if (!password.matches("[a-zA-Z0-9]*")) {
            throw new PasswordException("비밀번호는 문자열과 숫자로만 만들어주세요.");
        }
        System.out.println("비밀번호가 유효합니다." +  password);
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        try {
            test.validatePassword("1234");
        } catch (PasswordException e) {
            System.out.println("비밀번호 설정 예외 발생!!" + e.getMessage());
        }

        try {
            test.validatePassword(null);
        } catch (PasswordException e) {
            System.out.println("비밀번호가 비었습니다!" + e.getMessage());
        }

        try {
            test.validatePassword("!!!!!!");
        } catch (PasswordException e) {
            System.out.println("비밀번호가 문자열로만 이루어지지 않음!!" + e.getMessage());
        }

        try {
            test.validatePassword("valid123"); // 유효한 비밀번호
        } catch (PasswordException e) {
            System.out.println("예외 발생" + e.getMessage());
        }
    }
}
