package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    public void testThatGreatestCommonDivisorIsFound(){
        int number1 = 12;
        int number2 = 24;
        assertEquals(12, GreatestCommonDivisor.gcd(number1, number2));

    }

    @Test
    public void testThatTheGreatestCommonDivisorOf12And4is4(){
      int number1 = 12;
      int number2 = 4;
      assertEquals(4, GreatestCommonDivisor.gcd(number1, number2));

    }

    @Test
    public void testThatTheGreatestCommonDivisorOf0And2is2(){
        int number1 = 0;
        int number2 = 2;
        assertEquals(0, GreatestCommonDivisor.gcd(number1, number2));
    }

    @Test
    public void testThatGcfCannotCalculateNegativeNumbers(){
        int number1 = -3;
        int number2 = -8;
        assertEquals(0, GreatestCommonDivisor.gcd(number1, number2));
    }

    @Test
    public void testThatTheGcfOf5And20Is5(){
        int number1 = 5;
        int number2 = 20;
        assertEquals(5, GreatestCommonDivisor.gcd(number1, number2));
    }


}