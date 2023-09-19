import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsFactorialTest {

    @Test
    public void testThatWhenIEnter5IGetTheFactorialOf120(){
        int number = 5;
        assertEquals(120, MathematicsAssignments.factorial(number));
    }

    @Test
    public void testThatWhenIEnter2IGet2AsTheFactorial(){
        int number = 2;
        assertEquals(2, MathematicsAssignments.factorial(number));
    }

    @Test
    public void testThatWhenIEnter4IGet24AsTheFactorial(){
        int number = 4;
        assertEquals(24,MathematicsAssignments.factorial(number));
    }


    }
