package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTestt {

    private Account account = new Account();


    @Test
    void testThatUserCannotWithdrawMoreThanAccountBalance() {
        //given
        double amount = 17000;
        // when
        double balance = account.withdrawBalance(amount);
        // assert
        Assertions.assertEquals(13000, account.getBalance());
    }

}

//   @Test
//
//    public void depositTest() {

       // given

       // Account isrealAccount;
       // isrealAccount = new Account();

        // when
//
//        isrealAccount.deposit(4000);
//       //  check
//        double balance = isrealAccount.checkBalance();
//
//        assertEquals(4000 , isrealAccount.checkBalance());
//    }
//
//}