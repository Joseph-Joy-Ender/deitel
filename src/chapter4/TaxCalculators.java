package chapter4;

import java.util.Scanner;

public class TaxCalculators {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter name: ");
            String name = scanner.next();
            scanner.nextLine();
            taxCalculator.setName(name);
            System.out.println();
            System.out.println("Enter earnings: ");
            double earnings = scanner.nextDouble();
            taxCalculator.setEarnings(earnings);

            System.out.println("Name of citizen is " + taxCalculator.getName());
            System.out.println("Earnings of each citizen is " + taxCalculator.getEarnings());
            System.out.println("Citizens total tax is " + taxCalculator.calculateTaxRate());
            System.out.println();


        }
    }
}