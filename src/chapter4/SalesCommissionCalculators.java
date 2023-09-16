package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculators {
    public static void main(String[] args) {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        Scanner scanner = new Scanner(System.in);

        double totalOfItemSold = 0;

        boolean condition = true;

        System.out.println("Enter price of item sold: ");
        double priceOfItems = scanner.nextDouble();

        totalOfItemSold += priceOfItems;

        System.out.println("Do you wish to continue: ");
        String answer = scanner.next();
        scanner.nextLine();
        if (answer.equals("no")) condition = false;

        while (condition) {
            System.out.println("Enter price of item sold: ");
            priceOfItems = scanner.nextDouble();

            totalOfItemSold += priceOfItems;

            System.out.println("Do you wish to continue: ");
            answer = scanner.next();
            scanner.nextLine();

            if (answer.equals("no")) condition = false;

        }
        salesCommissionCalculator.setPriceForItemSold(totalOfItemSold);
        System.out.printf("Total of item sold is %.4f\n  ", salesCommissionCalculator.getPriceForItemSold());
        System.out.println("Salary is " + salesCommissionCalculator.getSALARY());
        System.out.println("Percentage is " + salesCommissionCalculator.getPERCENTAGE());
        System.out.printf("Calculated commission is %.4f\n", salesCommissionCalculator.calculateCommission());
        System.out.println("Total wages is " + salesCommissionCalculator.calculateTotalWage());


    }
}
