package chapter8;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Date(int month, int day, int year){
        monthValidation(month);
        dayValidation(day, month);
        isLeap(month, day, year);
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public void monthValidation(int month) {
        if (month <= 0 || month > 12) throw new IllegalArgumentException("Month (" + month + ") must be 1-12");

    }
    public void dayValidation(int day, int month) {
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day ==29)){
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
    }

    public void isLeap(int month, int day, int year) {
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("day (" + day + ") out of range for the specified month and year");
        }
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
