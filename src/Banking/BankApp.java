package Banking;

import Banking.exception.InsufficientFund;
import Banking.exception.InvalidAmount;
import Banking.exception.InvalidPinException;
import Banking.exception.NegativeAmount;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        mainMenu();

    }

    static Bank bank = new Bank("Stanbic Bank");

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        menuMap();
        String input = scanner.nextLine();

        switch (input.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> removeAccount();
            case '7' -> exit();
        }

    }

    private static void removeAccount() {
        Scanner scanner = new Scanner(System.in);
        display("Enter your account number: ");
        String number = scanner.nextLine();

        bank.removeAccount(number);
        bank.print();
        System.out.println();
        mainMenu();
    }

    private static void exit() {
        display("Good bye!!!");
        System.exit(0);
    }

    private static void checkBalance() {
        Scanner scanner = new Scanner(System.in);
        try {

            display("Enter your account number: ");
            String number = scanner.nextLine();

            display("Enter your pin: ");
            String pin = scanner.nextLine();

            display(String.valueOf(bank.checkBalance(number, Integer.parseInt(pin))));

        }catch (NullPointerException | InvalidPinException nullPointerException){
            display(nullPointerException.getMessage());
            checkBalance();
        }

        System.out.println();
        mainMenu();
    }

    private static void transfer() {
        Scanner scanner = new Scanner(System.in);
        try {

            display("Enter the sender account number: ");
            String sender = scanner.nextLine();

            display("Enter the receiver account number: ");
            String receiver = scanner.nextLine();

            display("Enter the amount: ");
            String amount = scanner.nextLine();

            display("Enter your pin: ");
            String pin = scanner.nextLine();

            bank.transfer(Double.parseDouble(amount), sender, receiver, Integer.parseInt(pin));

            bank.print();
        }catch (InvalidPinException | NullPointerException | InvalidAmount invalidPin){
            display(invalidPin.getMessage());
            transfer();
        }

        System.out.println();
        mainMenu();

    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        try {

            display("Enter amount to deposit: ");
            String amount = scanner.nextLine();

            display("Enter account number: ");
            String number = scanner.nextLine();

            bank.deposit(Double.parseDouble(amount), number);

            display("Your deposit was successful");


            bank.print();
        }catch (InvalidAmount | NumberFormatException invalidAmount){
            display(invalidAmount.getMessage());
            deposit();
        }
        System.out.println();
        mainMenu();

    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        try {

            display("Enter the account number: ");
            String number = scanner.nextLine();

            display("Enter amount to withdraw: ");
            String amount = scanner.nextLine();

            display("Enter your pin: ");
            String pin = scanner.nextLine();

            bank.withdraw(number, Integer.parseInt(pin), Double.parseDouble(amount));
            bank.print();

        }catch (InvalidPinException | InsufficientFund | NegativeAmount invalidPin){
            display(invalidPin.getMessage());
            withdraw();
        }
        System.out.println();
        mainMenu();

    }

    private static void menuMap() {
        String menu = """
                ====================================
                Welcome To Stanbic Bank Of Africa
                ***********************************
                1 -> createAccount
                2 -> deposit
                3 -> withdraw
                4 -> transfer
                5 -> checkBalance
                6 -> removeAccount
                7 -> exit
                """;
        display(menu);
    }

    private static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        display("Enter first name: ");
        String firstName = scanner.nextLine();

        display("Enter last name: ");
        String lastName = scanner.nextLine();

        display("Enter pin: ");
        String pin = scanner.nextLine();

        bank.createAccount(firstName, lastName, Integer.parseInt(pin));

        display("Account successfully created!!!");
        System.out.println();

        bank.print();
        mainMenu();

    }

    private static void display(String input){
        System.out.println(input);
    }

}
