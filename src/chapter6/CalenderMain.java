package chapter6;

import java.util.Scanner;

public class CalenderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = scanner.nextInt();

        System.out.print("Enter full year (e.g, 2012): ");
        int year = scanner.nextInt();

        Calender.printMonth(year, month);
    }
}
