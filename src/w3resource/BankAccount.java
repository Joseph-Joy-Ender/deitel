package w3resource;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds");
    }

    public double getBalance() {
        return balance;
    }
}
