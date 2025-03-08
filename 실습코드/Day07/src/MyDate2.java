public class MyDate2 {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("유효하지 않은 달입니다.");
        }
    }

    public void setDay(int day) {
        if (month == 2) {
            if (day >= 1 && day <= 28) {
                this.day = day;
            } else {
                System.out.println("2월은 1일부터 28일까지만 가능합니다.");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) {
                this.day =day;
            } else {
                System.out.println("1일부터 30일 사이의 숫자만 입력해주세요.");
            }
        } else {
            if (day >= 1 && day <= 31) {
                this.day = day;
            } else {
                System.out.println("1일부터 31일 사이의 숫자만 입력해주세요.");
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
