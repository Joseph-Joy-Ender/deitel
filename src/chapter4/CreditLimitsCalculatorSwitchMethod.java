package chapter4;

import java.util.Scanner;

public class CreditLimitsCalculatorSwitchMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int node = scanner.nextInt();

        switch (node){
          case 1 -> accountNumber();
          case 2 -> beginningBalance();
          case 3 -> totalOfAllItems();
          case 4 -> totalOfAllCreditsAppliedToCustomersAccount();
          case 5 -> creditLimit();
          case 6 -> newBalance();

        }
    }

    private static void accountNumber() {
        Scanner input = new Scanner(System.in);
        display("Enter account number -> ");
        input.nextInt();
    }

    private static void beginningBalance() {
        Scanner input = new Scanner(System.in);
        display("Enter beginning balance -> ");
        input.nextInt();
    }

    private static void totalOfAllItems() {
        Scanner input = new Scanner(System.in);
        display("Enter total of all items charged by customer -> ");
        input.nextInt();

        }


    private static void totalOfAllCreditsAppliedToCustomersAccount() {
    }

    private static void creditLimit() {
    }

    private static void newBalance() {
    }


    private static void display(String input){
        System.out.println(input);
    }
}
