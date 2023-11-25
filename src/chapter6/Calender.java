package chapter6;

import static chapter6.LeapYear.isLeapYear;

public class Calender {

    public static void printMonth(int year, int month){
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    private static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i;
        for (i = 0; i < startDay; i++)
            System.out.print("     ");
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%5d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();

        }
        System.out.println();
    }

    private static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        for (int i = 1; i < month ; i++) {
            total = total + getNumberOfDaysInMonth(year, i);

        }
        return total;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
        || month == 12) return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return 0;
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("----------------------------------");
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
    }

    private static String getMonthName(int month) {
        String monthName = "";
        switch (month){
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
        }
        return monthName;
    }

}
