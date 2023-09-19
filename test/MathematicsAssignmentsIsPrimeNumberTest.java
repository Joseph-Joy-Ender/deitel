import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsIsPrimeNumberTest {

    @Test
    public void testThatNumberEnteredIsAPrimeNumber(){
        int number = 71;
        assertTrue(MathematicsAssignments.isPrimeNumber(number));
    }

    @Test
    public void testThatNumberEnteredIsNotAPrimeNumber(){
        int number = 112;
        assertFalse(MathematicsAssignments.isPrimeNumber(number));
    }


}