package chapter6;

import java.util.Scanner;

public class LeapYearMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if its a leap year: ");
        int year = scanner.nextInt();
        System.out.println(LeapYear.isLeapYear(year));
    }
}
