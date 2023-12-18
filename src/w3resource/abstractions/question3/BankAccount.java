package w3resource.abstractions.question3;

public abstract class BankAccount {
    private double balance;
    private String accountNumber;
    public BankAccount(double balance, String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
