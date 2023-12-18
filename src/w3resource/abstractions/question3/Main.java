package w3resource.abstractions.question3;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000.0, "SA001");
        System.out.println("Savings A/C: Initial balance: $ " + savings.getBalance());
            savings.deposit(500.00);
            savings.withdraw(250.00);
            savings.withdraw(1600.00);
            System.out.println();

        CurrentAccount account = new CurrentAccount(5000.00, "BA002");
        System.out.println("Current A/C: Initial balance: $ " + account.getBalance());
        account.deposit(1000.00);
        account.withdraw(3000.00);
        account.withdraw(6000.00);
    }
}
