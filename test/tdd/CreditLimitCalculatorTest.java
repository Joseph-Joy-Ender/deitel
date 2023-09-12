package tdd;

import chapter4.CreditLimitCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreditLimitCalculatorTest {

    private final CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();

    @Test
    public void testThatCreditLimitCalculatorExist(){
        assertNotNull(creditLimitCalculator);
    }

    @Test
    void testThatCreditLimitCalculatorHasAccountNumber(){
        creditLimitCalculator.setAccountNumber(216610572);
        assertEquals(216610572, creditLimitCalculator.getAccountNumber());
    }
    @Test
    void testThatCreditLimitCalculatorHasBeginningBalance(){
        creditLimitCalculator.setBeginningBalance(50000);
        assertEquals(50000, creditLimitCalculator.getBeginningBalance());

    }
    @Test
    void testThatCreditLimitCalculatorHasTotalOfAllItems(){
        creditLimitCalculator.setTotalItems(20);
        assertEquals(20, creditLimitCalculator.getTotalItems());

    }
    @Test
    void testThatCreditLimitCalculatorHasTotalOfCreditAppliedToCustomersAccount(){
        creditLimitCalculator.setTotalOfCredits(100);
        assertEquals(100, creditLimitCalculator.getTotalOfCredits());
    }
    @Test
    void testThatCreditLimitCalculatorHasCreditLimit(){
        creditLimitCalculator.setCreditLimit(30000);
        assertEquals(30000, creditLimitCalculator.getCreditLimit());

    }
    @Test
    public void testThatCreditLimitCalculatorHasNewBalance(){
        creditLimitCalculator.setBeginningBalance(50000);
        creditLimitCalculator.setTotalItems(20);
        creditLimitCalculator.setTotalOfCredits(100);
        assertEquals(49920, creditLimitCalculator.calculateNewBalance());
    }
    @Test
    void testThatTotalItemCantBeLessThanZero(){
        creditLimitCalculator.setTotalItems(-1);
        assertEquals(0, creditLimitCalculator.getTotalItems());
    }

    @Test
    public void testThatCreditLimitCalculatorHasNewBalanceAndDisplaysCreditLimitExceeded(){
        creditLimitCalculator.setBeginningBalance(50000);
        creditLimitCalculator.setTotalItems(-5);
        creditLimitCalculator.setTotalOfCredits(100);
        assertEquals(49900, creditLimitCalculator.calculateNewBalance());
    }
    @Test
    public void checkThatWhenCreditLimitIsNotExceededMessageIsNotDisplayed(){
        creditLimitCalculator.setBeginningBalance(50000);
        creditLimitCalculator.setTotalItems(20);
        creditLimitCalculator.setTotalOfCredits(51000);
        assertEquals(-980, creditLimitCalculator.calculateNewBalance());
    }
}
