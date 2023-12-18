package w3resource.abstractions.question3;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $ " + amount + "successful. Current balance: $ " + getBalance());



    }

    @Override
    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $ " + amount + " successful. Current balance: $ " + getBalance());
        }
        else System.out.println("Insufficient funds. Withdrawal failed");

    }
}
