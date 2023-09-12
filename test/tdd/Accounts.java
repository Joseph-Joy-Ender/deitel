package tdd;

public class Accounts {

    private double balance;

    public Accounts(double balance){
        this.balance = balance;
    }

    public void addDepositAmount(double amount) {
        if(amount >= 0) {
            this.balance += amount;
        }
    }

    public void withdrawMoney(double amount) {
        if(amount < this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
