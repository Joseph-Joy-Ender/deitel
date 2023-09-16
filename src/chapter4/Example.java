package chapter4;

import javax.swing.*;

public class Example {
        public static void main(String[] args) {

            CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();


            int accountNumber = Integer.parseInt(input("Enter your account number: "));
            creditLimitCalculator.setAccountNumber(accountNumber);

            int beginningBalance = Integer.parseInt(input("Enter beginning balance: "));
            creditLimitCalculator.setBeginningBalance(beginningBalance);

            int totalItems = Integer.parseInt(input("Enter total of all items: "));
            creditLimitCalculator.setTotalItems(totalItems);

            int totalOfCredits = Integer.parseInt(input("Enter total of credits: "));
            creditLimitCalculator.setTotalOfCredits(totalOfCredits);

            int creditLimit = Integer.parseInt(input("Enter credit limit: "));
            creditLimitCalculator.setCreditLimit(creditLimit);

            display("Account number is " + creditLimitCalculator.getAccountNumber());
            display("Your balance at the beginning of the month is " + creditLimitCalculator.getBeginningBalance());
            display("Total of all items charged by customers is " + creditLimitCalculator.getTotalItems());
            display("Total of all credits applied to account is " + creditLimitCalculator.getTotalOfCredits());
            display("The allowed credit limit is " + creditLimitCalculator.getCreditLimit());
            display("The new balance is " + creditLimitCalculator.calculateNewBalance());
        }
        public static void display(String message){
            JOptionPane.showMessageDialog(null,message);
        }

        public static String input(String prompt){
           return JOptionPane.showInputDialog(prompt);
        }
}
