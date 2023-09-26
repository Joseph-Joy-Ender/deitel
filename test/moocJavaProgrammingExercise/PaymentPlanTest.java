package moocJavaProgrammingExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentPlanTest {

    private final PaymentPlan paymentPlan = new PaymentPlan();

    @Test
    public void testThatPaymentPlanHasBalance(){
        paymentPlan.setBalance(150);
        assertEquals(150, paymentPlan.getBalance());
    }

    @Test
    public void testThatStudentCanEatAffordably(){
        double balance = 150;
        double amount = 2.60;
        double eatAffordably = balance - amount;
    }

}