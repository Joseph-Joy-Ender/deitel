package tdd;

import tdd.Accounts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsTest{

    @Test
    void accountBalance(){

        Accounts enderAccount = new Accounts(0);
        // given
        enderAccount.addDepositAmount(5000);
        double accountsBalance = enderAccount.getBalance();

        //check
        assertEquals(5000, accountsBalance);
    }

    @Test
    void accountsBalance(){
        Accounts enderAccount = new Accounts(0);

        enderAccount.addDepositAmount(2000);
        enderAccount.addDepositAmount(5000);
        //when
        double accountsBalance = enderAccount.getBalance();
        //assert
        assertEquals(7000, accountsBalance);
    }

    @Test
    void withdrawal(){
        Accounts enderAccount = new Accounts(2500);

        enderAccount.withdrawMoney(1000);
        //when
        double balance = enderAccount.getBalance();
        //assert
        assertEquals(1500, balance);

    }

    @Test
    void insufficientFunds(){
        Accounts enderAccount = new Accounts(2500);
        enderAccount.withdrawMoney(4500);
        //given
        double accountBalances = enderAccount.getBalance();
        //when
        // assert
        assertEquals(2500, accountBalances);
    }
}
