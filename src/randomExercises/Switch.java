package randomExercises;
import java.util.Scanner;

public class Switch {
    private static double amount;
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int node = scanner.nextInt();
        switch (node){
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> transfer();
            case 4 -> balance();
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
               *********************
               =======================""";
        display(menu);
    }

    private static void balance() {
        Scanner input = new Scanner(System.in);
        display("Enter pin to check balance -> ");
        input.nextInt();
        display("Your Balance is -> "+ amount );
        input.next();
        menu();
    }

    private static void transfer() {
        Scanner input = new Scanner(System.in);
        display("Enter Recipient Account Number -> ");
        input.nextDouble();
        display("""
                press
                1 -> UBA
                2 -> STANBIC BANK
                3 -> UNION BANK
                4 -> OPAY
                5 -> PALMPAY
                """);
        input.nextDouble();
        display("Enter Account Name: ");
        input.nextLine();
        input.next();
        display("Enter Amount to transfer: ");
        input.nextDouble();
        display("Your transaction was successful");
        input.next();
        menu();

    }

    private static void withdraw() {
        Scanner input = new Scanner(System.in);
        display("Enter your pin");
        input.nextInt();
        double withdrawalAmount = input.nextDouble();
        if (withdrawalAmount < amount){
            display("Enter withdrawal amount");
            input.nextDouble();
        boolean amountInput = input.nextBoolean();
        if (amountInput){
            display("successful");
        }
        }
        else display("insufficient funds");

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
        input.nextDouble();
        display("Enter amount: ");
        amount = input.nextDouble();
        display("Deposit was successful");

        menu();

    }
    private static void display(String input){
        System.out.println(input);
    }

}