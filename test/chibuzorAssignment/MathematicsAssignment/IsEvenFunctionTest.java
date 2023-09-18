package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenFunctionTest {

    @Test
    public void testThatNumberEnteredIsEven(){
        int number = 22;
        assertTrue(IsEvenFunction.isEven(number));
    }

    @Test
    public void testThatNumberEnteredIsOddAndFalse(){
        int number = 43;
        assertFalse(IsEvenFunction.isEven(number));
    }

}