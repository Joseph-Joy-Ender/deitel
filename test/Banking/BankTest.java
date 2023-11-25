package Banking;
import Banking.exception.InvalidAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    @Test
    public void testThatBankCanCreateAnAccount() {
        Bank bank = new Bank("BankName");
        Account account = bank.createAccount("firstName", "lastName", 1234);
        assertEquals("1", account.accountNumber());
        assertEquals(1, bank.getTotalNumberOfAccounts());
    }

    @Test
    public void testThatICanCreateTwoAccounts(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        Account secondAccount = bank.createAccount("firstName", "lastName", 1234);
        assertEquals("1", firstAccount.accountNumber());
        assertEquals("2", secondAccount.accountNumber());
        assertEquals(2, bank.getTotalNumberOfAccounts());
    }

    @Test
    void testThatICanFindAccountWithTheAccountNumber(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        Account secondAccount = bank.createAccount("firstName", "lastName", 1234);
        assertEquals(firstAccount, bank.findAccount("1"));
        assertEquals(secondAccount, bank.findAccount("2"));

    }

    @Test
    void testThatICanDeposit2kToAccountWithTheAccountNumber(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        bank.deposit(2_000, "1");
        assertEquals(firstAccount.checkBalance(1234), 2_000);

    }

    @Test
    void testThatICanDeposit2k_andAnother2k_ToAccountWithTheAccountNumber(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        bank.deposit(2_000, "1");
        bank.deposit(2_000, "1");
        assertEquals(firstAccount.checkBalance(1234), 4_000);

    }

    @Test
    void testThatNegativeAmountCannotBeDeposited(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        assertThrows(InvalidAmount.class, () ->  bank.deposit(-2_000, "1"));

    }

    @Test
    void testThatICanDeposit2_000_AndICanWithdraw1_000_AndBalanceIs1_000(){
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        bank.deposit(2_000, "1");
        bank.withdraw("1", 1234, 1_000);
        assertEquals(firstAccount.checkBalance(1234), 1_000);

    }

    @Test
    void testThatICanDeposit5k_AndTransferToAnotherAccount() {
        Bank bank = new Bank("BankName");
        Account firstAccount = bank.createAccount("firstName", "lastName", 1234);
        Account secondAccount = bank.createAccount("firstName", "lastName", 1234);

        assertEquals(firstAccount, bank.findAccount("1"));
        assertEquals(secondAccount, bank.findAccount("2"));

        bank.deposit(5_000, "1");

        bank.transfer(3_000, "1", "2", 1234);

        assertEquals(2_000, firstAccount.checkBalance(1234));
        assertEquals(3_000, secondAccount.checkBalance(1234));

    }
}
