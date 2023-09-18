package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    public void testThatWhenIDivideTwoNumbersItIsDivided(){
        int number1 = 3;
        int number2 = 7;
        assertEquals(4, Subtraction.subtract(number1, number2));
    }

    @Test
    public void testThatWhenIDivide7From100IGet93(){
        int number1 = 7;
        int number2 = 100;
        assertEquals(93, Subtraction.subtract(number1, number2));
    }
}