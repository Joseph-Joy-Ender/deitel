package w3resource;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
            BankAccount bankAccount = new BankAccount(500, "BA1234");

        System.out.println("Deposit $1000 into account BA1234:");
        bankAccount.deposit(1000);

        System.out.println("New balance after depositing $1000: $" + bankAccount.getBalance());

        System.out.println("Withdraw $600 from account BA1234:");
        bankAccount.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + bankAccount.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount(450, "SA1234");

        SA1234.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount(300, "SA1000");

        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());


    }
}
