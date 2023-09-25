package chapter5;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
         int principal = scanner.nextInt();

        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();

        System.out.printf("%s%23s%n",    "Year",       "Amount on deposit");

        for (int year = 1; year <= 10 ; year++) {

            double amount =  (principal * Math.pow(1.0 + rate, year));

            System.out.printf("%4d%,20.2f%n", year, amount);

        }
    }
}
