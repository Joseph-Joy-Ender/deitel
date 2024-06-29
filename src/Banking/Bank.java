package Banking;

import Banking.exception.InvalidAmount;

import java.util.ArrayList;

public class Bank {
    private int totalNumberOfAccounts;
      ArrayList<Account> accounts;

    public Bank(String bankName) {
        accounts = new ArrayList<>();
    }

    public Account createAccount(String firstName, String lastName, int pin) {
        totalNumberOfAccounts++;
        String accountName = generateAccountName(firstName, lastName);
        String accountNumber = generateAccountNumber();
        Account account =  new Account(accountName, accountNumber, pin);
        accounts.add(account);
       return account;

    }

    private String generateAccountNumber() {
        return totalNumberOfAccounts+"";
    }

    private String generateAccountName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public int getTotalNumberOfAccounts() {
       return accounts.size();
    }

    public Account findAccount(String number) {
        for (Account account: accounts) {
            if (account.accountNumber().equals(number)) return account;

        }
        return null;
    }

    public void deposit(double amount, String number) throws InvalidAmount {
        Account account = findAccount(number);
        account.deposit(amount);

    }

    public void withdraw(String number, int pin, double amount) {
        Account account = findAccount(number);
        account.withdraw(amount, pin);
    }

    public void transfer(double amount, String sender, String receiver, int pin) {
        Account account1 = findAccount(sender);
        Account account2 = findAccount(receiver);
        account1.withdraw(amount, pin);
        account2.deposit(amount);
    }

    public double checkBalance(String number, int pin) {
        Account account = findAccount(number);
       return account.checkBalance(pin);

    }

    public void removeAccount(String number){
        accounts.removeIf(account -> account.accountNumber().equals(number));

    }


}
