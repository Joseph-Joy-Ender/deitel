package Banking;

import Banking.exception.InsufficientFund;
import Banking.exception.InvalidAmount;
import Banking.exception.InvalidPinException;
import Banking.exception.NegativeAmount;

public class Account {

    private double balance;
    private final int pin;
    private final String number;
    private final String name;
    public Account(String accountName, String accountNumber, int pin) {
        this.pin = pin;
        number = accountNumber;
        name = accountName;
    }

    public void deposit(double amount)  {
        validate(amount);
        balance += amount;
    }

    private void validate(double amount)  {
        if (amount < 0) throw new InvalidAmount("Amount must be greater than zero");
    }

    public double checkBalance(int pin) {
        validate(pin);
        return balance;
    }

    private void validate(int pin){
        if (pin != this.pin) throw new InvalidPinException("Incorrect pin");
    }

    public void withdraw(double amount, int pin) {
        validate(pin);
        checkSufficientFund(amount);
        checkNegativeWithdrawal(amount);
        balance -= amount;
    }

    private void checkSufficientFund(double amount) {
        if (amount > balance) throw new InsufficientFund("You have insufficient funds");
    }

    private void checkNegativeWithdrawal(double amount) {
        if (amount < 0) throw new NegativeAmount("You can't withdraw a negative amount");
    }

    public String accountNumber() {
        return number;
    }


    public String toString() {
        return String.format("""
                Your Account details
                Account Name: %s
                Account number: %s
                Account Balance: %s
                
                """, name, number, balance);
    }
}
