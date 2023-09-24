package chapter4;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        String month = scanner.next();

        switch (month) {
            case "1" -> {
                month = "Jan";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "2" -> {
                month = "Feb";
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println(month + " " + year + " has 29 days");
                } else {
                    System.out.println(month + " " + year + " has 28 days");
                }
            }
            case "3" -> {
                month = "Mar";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "4" -> {
                month = "Apr";
                System.out.println(month + " " + year + " has 30 days");
            }
            case "5" -> {
                month = "May";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "6" -> {
                month = "Jun";
                System.out.println(month + " " + year + " has 30 days");
            }
            case "7" -> {
                month = "Jul";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "8" -> {
                month = "Aug";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "9" -> {
                month = "Sep";
                System.out.println(month + " " + year + " has 30 days");
            }
            case "10" -> {
                 month = "Oct";
                System.out.println(month + " " + year + " has 31 days");
            }
            case "11" -> {
                month = "Nov";
                System.out.println(month + " " + year + " has 30 days");
            }
            case "12" -> {
                month = "Dec";
                System.out.println(month + " " + year + " has 31 days");
            }

            default -> throw new IllegalStateException("Unexpected value: " + month);
        }

    }
}
