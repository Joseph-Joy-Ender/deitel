package randomExercises;
import java.util.Scanner;

public class Switch {
    private static final double accountBalance = 10000;
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int node = scanner.nextInt();
        switch (node){
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> transfer();
            case 4 -> balance();
            case 5 -> airtimeForSelf();
            case 6 -> airtimeForOthers();
            case 7 -> dataPlans();
        }
    }

    private static void menu(){
        String menu = """
               ======================
               WELCOME TO BANK OF JOY
               *********************
               1-> deposit
               2-> withdraw
               3-> transfer
               4-> checkBalance
               5-> airtime-Self
               6-> airtime-Others
               7-> dataPlans
               *********************
               =======================""";
        display(menu);
    }

    private static void balance() {
        Scanner input = new Scanner(System.in);
        display("Enter pin to check balance -> ");
        input.nextInt();
        display("Your Balance is -> " + accountBalance);
        System.out.println();
        menu();
    }

    private static void transfer() {
        Scanner input = new Scanner(System.in);
        display("Enter Recipient Account Number -> ");
        input.nextLine();
        display("""
                press
                1 -> UBA
                2 -> STANBIC BANK
                3 -> UNION BANK
                4 -> OPAY
                5 -> PALM PAY
                """);
        input.nextInt();
        display("Enter Account Name: ");
        input.next();
        input.nextLine();
        display("Enter Amount to transfer: ");
        double transferAmount = input.nextDouble();
        if (transferAmount < accountBalance){
            double balance = accountBalance - transferAmount;
            display("Your transaction was successful");
            display("Balance: " + balance);
        }else {
            display("Transaction failed! ");
            display("balance: " + accountBalance);
        }
        System.out.println();
        menu();

    }

    private static void withdraw() {
        Scanner input = new Scanner(System.in);
        display("Enter your pin");
        input.nextInt();
        display("Enter withdrawal amount");
        double withdrawalAmount = input.nextDouble();
        if (withdrawalAmount < accountBalance) {
            display("Withdrawal successful");
            display("Debit: " + withdrawalAmount);
            double balance = accountBalance - withdrawalAmount;
            display("Balance: " + (balance));
        } else {
            display("insufficient funds");
            display("Your account balance: " + (accountBalance));
        }
        System.out.println();
        menu();

    }
    private static void deposit() {
        Scanner input = new Scanner(System.in);
        display("Enter first name: ");
        input.nextLine();
        display("Enter last name: ");
        input.nextLine();
        display("Enter bank name: ");
        input.nextLine();
        display("Enter account number: ");
        input.nextLine();
        display("Enter amount: ");
        input.nextDouble();
        display("Deposit was successful");
        System.out.println();
        menu();
    }

    private static void dataPlans() {
       Scanner input = new Scanner(System.in);
       display("Enter phone number: ");
       input.nextLong();
       display("Select data plans: ");
        display("""
                        press
                        1 -> N500/1GB/2 days
                        2 -> N700/2.5GB/5 days
                        3 -> N1500/6GB/7 days
                        4 -> N2000/6.5GB/14 days
                        5 -> N3000/11GB/30 days
                        6 -> N5000/22GB/30 days
                        """);
        int dataPlan = input.nextInt();
        if (dataPlan == 1) display("Data plan of N500 has been activated");
        if (dataPlan == 2) display("Data plan of N700 has been activated");
        if (dataPlan == 3) display("Data plan of N1500 has been activated");
        if (dataPlan == 4) display("Data plan of N2000 has been activated");
        if (dataPlan == 5) display("Data plan of N3000 has been activated");
        if (dataPlan == 6) display("Data plan of N5000 has been activated");

        System.out.println();
        menu();
    }

    private static void airtimeForSelf() {
       Scanner input = new Scanner(System.in);
       display("Please enter your pin: ");
       input.nextInt();
       display("Please enter amount(50 - 10000): ");
       double airtimeAmount = input.nextDouble();
       if (airtimeAmount < accountBalance){
           display("Transaction is being processed.....");
           display("Recharge is successful");
           double balance = accountBalance - airtimeAmount;
           display("Balance: " + balance);
       }else {
           display("Account balance is too low to purchase airtime");
       }

        System.out.println();
       menu();
    }

    private static void airtimeForOthers() {
       Scanner input = new Scanner(System.in);
       display("Please enter pin: ");
       input.nextInt();
       display("Please enter recipient number: ");
       input.nextInt();
       display("""
               Please enter recipient network
               1 -> MTN
               2 -> AIRTEL
               3 -> GLO
               4 -> 9MOBILE
               """);
       input.nextInt();
       display("Enter amount(50 - 10000): ");
       double airtimeAmount = input.nextDouble();
       if (airtimeAmount < accountBalance){
           display("Transaction successful");
           double balance = accountBalance - airtimeAmount;
           display("Balance: " + balance);
       }else {
           display("Transaction failed, Not enough funds to buy airtime");
           display(String.valueOf(accountBalance));
       }


    }
    private static void display(String input){
        System.out.println(input);
    }

}