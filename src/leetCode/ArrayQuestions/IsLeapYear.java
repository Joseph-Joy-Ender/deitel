package leetCode.ArrayQuestions;

public class IsLeapYear {

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        int year = 2005;
        IsLeapYear isLeapYear = new IsLeapYear();
        System.out.println(isLeapYear.isLeapYear(year));
    }
}
