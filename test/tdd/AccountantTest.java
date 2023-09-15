package tdd;

public class AccountantTest {
    public static void main(String[] args) {

        Accountant account = new Accountant(10000);

        account.deposit(5000);
        System.out.printf("Deposit amount is %s%n", account.checkBalance());
        // System.out.printf("Deposited amount is %s%n", account.checkBalance());

        // account = new Accountant(85000);
        account.withdrawal(4000);
        System.out.printf("Withdrawal amount is %d%n ", account.checkBalance());

        // account = new Accountant(2000);
        // account.checkBalance();
        System.out.printf("balance is %d%n ", account.checkBalance());
    }
}
