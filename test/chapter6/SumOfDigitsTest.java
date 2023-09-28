package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @Test
    void testThatWhenUserEntersAFourDigitsIntegersSumOfDigitsIsGiven() {
        int digits = 7631;
        assertEquals(17, SumOfDigits.sumOfDigits(digits));
    }

    @Test
    public void testThatUserCannotEnterANumberLessThat4(){
        int digits = 1232;
        assertEquals(8, SumOfDigits.sumOfDigits(digits));
    }

    @Test
    public void testThatNegativeNumberCannotBeSummed(){
        int digits = -2131;
        assertEquals(-7, SumOfDigits.sumOfDigits(digits));
    }

    @Test
    public void testThatTheSumOf1234Is10(){
        int digits = 1234567;
        assertEquals(28, SumOfDigits.sumOfDigits(digits));
    }

    @Test
    public void testThatTheSumOf123Is9(){
        int digits = 234;
        assertEquals(9, SumOfDigits.sumOfDigits(digits));
    }
}