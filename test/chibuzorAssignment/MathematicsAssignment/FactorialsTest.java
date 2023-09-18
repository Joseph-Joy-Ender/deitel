package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {

    @Test
    public void testThatWhenIEnter5IGetTheFactorialOf120(){
        int number = 5;
        assertEquals(120, Factorials.factorial(number));
    }

    @Test
    public void testThatWhenIEnter2IGet2AsTheFactorial(){
        int number = 2;
        assertEquals(2, Factorials.factorial(number));
    }

    @Test
    public void testThatWhenIEnter4IGet24AsTheFactorial(){
        int number = 4;
        assertEquals(24,Factorials.factorial(number));
    }
}