package Banking;

import Banking.exception.InsufficientFund;
import Banking.exception.InvalidAmount;
import Banking.exception.InvalidPinException;
import Banking.exception.NegativeAmount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    @BeforeEach
    void setUp() {
        account = new Account("Stanbic", "9018296447", 1234);
    }

    @Test
    void testThatAccountExist(){
        assertNotNull(account);
    }

    @Test
    void testThatAccountCanDeposit2_000_andBalanceIs2_000(){
        account.deposit(2_000.00);
        assertEquals(2_000.00, account.checkBalance(1234));
    }

    @Test
    void testThatICanDeposit1_000_and2_000_andBalanceIs3_000() {
        account.deposit(1_000.00);
        account.deposit(2_000);
        double balance = account.checkBalance(1234);
        assertEquals(3_000, balance);
    }

    @Test
    void testThatICannotDepositNegativeAmount() {
        assertThrows(InvalidAmount.class, () ->  account.deposit(-1_000.00));
    }

    @Test
    void testThatPinMustBeCorrect() {
        assertThrows(InvalidPinException.class, () -> account.checkBalance(12347));
    }

    @Test
    void testThatICanDeposit1_000_andWithdraw5h() {
        account.deposit(1_000.00);
        account.withdraw(500.00, 1234);
        assertEquals(500.00, account.checkBalance(1234));
    }

    @Test
    void testThatICanDeposit2_000AndWithdraw1_000_AndBalanceIs1_000(){
        account.deposit(1_000.00);
        account.deposit(1_000.00);
        account.withdraw(1_000.00, 1234);
        assertEquals(1_000.00, account.checkBalance(1234));
    }

    @Test
    void testThatNegativeAmountAndAmountGreaterThanBalanceCannotBeWithdrawn() {
        account.deposit(1500);
        assertThrows(InsufficientFund.class, () -> account.withdraw(2000, 1234));
    }

    @Test
    void testThatNegativeAmountCantBeWithdrawn() {
        account.deposit(1000.00);
        assertThrows(NegativeAmount.class, () -> account.withdraw(-100, 1234));
    }
}