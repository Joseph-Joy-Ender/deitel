package chapter6;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 0) {
            System.out.println("Year must be greater than 0");
        }
            return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;


    }

}
