package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeNumberTest {


    @Test
    public void testThatNumberEnteredIsAPrimeNumber(){
        int number = 71;
        assertTrue(IsPrimeNumber.isPrimeNumber(number));
    }

    @Test
    public void testThatNumberEnteredIsNotAPrimeNumber(){
        int number = 112;
        assertFalse(IsPrimeNumber.isPrimeNumber(number));
    }
}