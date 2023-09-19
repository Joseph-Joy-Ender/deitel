import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsSubtractionTest {


    @Test
    public void testThatWhenISubtractTwoNumbersItIsDivided(){
        int number1 = 3;
        int number2 = 7;
        assertEquals(4, MathematicsAssignments.subtract(number1, number2));
    }

    @Test
    public void testThatWhenISubtract7From100IGet93(){
        int number1 = 7;
        int number2 = 100;
        assertEquals(93, MathematicsAssignments.subtract(number1, number2));
    }

    @Test
    public void testThatWhenISubtract2From3IGet06(){
        int number1 = 2;
        int number2 = 3;
        assertEquals(1, MathematicsAssignments.subtract(number1, number2));
    }

    @Test
    public void testThatWhenISubtract20From5IGet15(){
        int number1 = 20;
        int number2 = 5;
        assertEquals(15, MathematicsAssignments.subtract(number1, number2));
    }

    @Test
    public void testThatWhenISubtractANegativeNUmberIGet0(){
        int number1 = 19;
        int number2 = 3;
        assertEquals(16, MathematicsAssignments.subtract(number1, number2));
    }

}