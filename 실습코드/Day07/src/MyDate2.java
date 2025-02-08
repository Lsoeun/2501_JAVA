public class MyDate2 {
    private int year;
    private int month;
    private int day;

    // Year setter
    public void setYear(int year) {
        this.year = year;
    }

    // Month setter
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("유효하지 않은 월입니다. (1~12 사이로 입력하세요)");
        }
    }

    // Day setter
    public void setDay(int day) {
        if (month == 0) {
            System.out.println("먼저 월을 설정하세요.");
            return;
        }

        // 월별 날짜 검사
        if (month == 2) {
            if (day >= 1 && day <= 28) { // 2월은 28일까지
                this.day = day;
            } else {
                System.out.println("유효하지 않은 날짜입니다.");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) { // 30일까지 있는 월
                this.day = day;
            } else {
                System.out.println("유효하지 않은 날짜입니다.");
            }
        } else {
            if (day >= 1 && day <= 31) { // 31일까지 있는 월
                this.day = day;
            } else {
                System.out.println("유효하지 않은 날짜입니다.");
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}