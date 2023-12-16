package w3resource;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public void withdraw(double amount){
        if (getBalance() - amount < 100) System.out.println("Minimum balance of $100 required!");
        else super.withdraw(amount);

    }
}
