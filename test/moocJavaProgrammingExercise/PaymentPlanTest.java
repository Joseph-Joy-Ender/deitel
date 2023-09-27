package moocJavaProgrammingExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentPlanTest {

    private final PaymentPlan paymentPlan = new PaymentPlan();

    @Test
    public void testThatPaymentPlanHasBalance(){
        paymentPlan.paymentCard(150);
        assertEquals(150, paymentPlan.getBalance());
    }

    @Test
    public void testThatStudentCanEatAffordably(){
        paymentPlan.paymentCard(150);
        assertEquals(150, paymentPlan.getBalance());
        paymentPlan.eatAffordably(2.60);
        assertEquals(147.4, paymentPlan.getBalance());
    }

    @Test
    public void testThatStudentCanEatHeartily(){
        paymentPlan.paymentCard(150);
        assertEquals(150, paymentPlan.getBalance());
        paymentPlan.eatHeartily(4.60);
        assertEquals(145.4, paymentPlan.getBalance());
    }

    @Test
    public void testThatStudentCanAddMoney(){
        paymentPlan.paymentCard(145.4);
        paymentPlan.addMoney(4.60);
        assertEquals(150, paymentPlan.getBalance());
    }

    @Test
    public void testThatBalanceCannotExceed150(){
      //n   paymentPlan.paymentCard(150);
        paymentPlan.addMoney(200.0);
        assertEquals(150, paymentPlan.getBalance());
    }


}