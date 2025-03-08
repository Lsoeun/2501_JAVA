public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        }
        if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
        }
        // 조건을 모두 통과한 경우에만 userID를 설정
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        try{
            test.setUserID(null);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            test.setUserID("123456789");
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
