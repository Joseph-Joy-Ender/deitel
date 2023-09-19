import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsDivisionTest {


    @Test
    public void testThatWhenSecondNumberIsZeroTheQuotientIsZero() {
        int number1 = 10;
        int number2 = 0;
        assertEquals(0, MathematicsAssignments.divide(number1, number2));

    }

    @Test
    public void testThatWhenIDivide10And2IGet5(){
        int number1 = 10;
        int number2 = 2;
        assertEquals(5, MathematicsAssignments.divide(number1, number2));
    }


    @Test
    public void testThatWhenIDivide2And10IGet05(){
        int number1 = 2;
        int number2 = 10;
        assertEquals(0.2, MathematicsAssignments.divide(number1, number2));
    }

}