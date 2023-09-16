package chapter4;

import java.util.Scanner;

public class CreditLimitsCalculators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        creditLimitCalculator.setAccountNumber(accountNumber);

        System.out.print("Enter beginning balance: ");
        int beginningBalance = scanner.nextInt();
        creditLimitCalculator.setBeginningBalance(beginningBalance);

        System.out.print("Enter total of all items: ");
        int totalItems = scanner.nextInt();
        creditLimitCalculator.setTotalItems(totalItems);

        System.out.print("Enter total of credits: ");
        int totalOfCredits = scanner.nextInt();
        creditLimitCalculator.setTotalOfCredits(totalOfCredits);

        System.out.print("Enter credit limit: ");
        int creditLimit = scanner.nextInt();
        creditLimitCalculator.setCreditLimit(creditLimit);


        System.out.println("Account number is " + creditLimitCalculator.getAccountNumber());
        System.out.println("Your balance at the beginning of the month is " + creditLimitCalculator.getBeginningBalance());
        System.out.println("Total of all items charged by customers is " + creditLimitCalculator.getTotalItems());
        System.out.println("Total of all credits applied to account is " + creditLimitCalculator.getTotalOfCredits());
        System.out.println("The allowed credit limit is " + creditLimitCalculator.getCreditLimit());
        System.out.println("The new balance is " + creditLimitCalculator.calculateNewBalance());



    }
}

