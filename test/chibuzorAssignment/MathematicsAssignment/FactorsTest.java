package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {

    @Test
    public void testThatWhenIEnter10IGet4AsTheFactor(){
        int number = 10;
        assertEquals(4, Factors.factors(number));
    }

    @Test
    public void testThatWhenIEnter125IGet4AsTheFactor(){
        int number = 125;
        assertEquals(4, Factors.factors(number));
    }

    @Test
    public void testThatWhenIEnter100IGet5AsTheFactor(){
        int number = 100;
        assertEquals(9, Factors.factors(number  ));
    }

}