package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMultiplesTest {

    @Test
    public void testThatSecondNumberIsAMultipleOfFirstNumber(){
        int firstNumber = 10;
        int secondNumber = 20;
        assertTrue(IsMultiples.isMultiples(firstNumber, secondNumber));
    }

    @Test
    public void testThat20IsAMultipleOf5(){
        int number1 = 5;
        int number2 = 20;
        assertTrue(IsMultiples.isMultiples(number1, number2));
    }

    @Test
    public void testThat28IsNotAMultiple5(){
        int number1 = 5;
        int number2 = 28;
        assertFalse(IsMultiples.isMultiples(number1, number2));
    }

    @Test
    public void testThat4IsAMultipleOf2(){
        int firstNumber = 2;
        int secondNumber = 4;
        assertTrue(IsMultiples.isMultiples(firstNumber, secondNumber));
    }

}