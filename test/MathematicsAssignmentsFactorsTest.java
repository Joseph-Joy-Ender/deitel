import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsFactorsTest {

    @Test
    public void testThatWhenIEnter10IGet4AsTheFactor(){
        int number = 10;
        assertEquals(4, MathematicsAssignments.factors(number));
    }

    @Test
    public void testThatWhenIEnter125IGet4AsTheFactor(){
        int number = 125;
        assertEquals(4, MathematicsAssignments.factors(number));
    }

    @Test
    public void testThatWhenIEnter100IGet5AsTheFactor(){
        int number = 100;
        assertEquals(9, MathematicsAssignments.factors(number  ));
    }

    @Test
    public void testThatWhenIInput500IGet12AsTheFactor(){
        int number = 500;
        assertEquals(12, MathematicsAssignments.factors(number));
    }

    @Test
    public void testThatWhenIInput20IGet6AsTheFactor(){
        int number = 20;
        assertEquals(6, MathematicsAssignments.factors(number));
    }

    @Test
    public void testThatWhenIEnter30IGet8AsTheFactor(){
        int number = 30;
        assertEquals(8, MathematicsAssignments.factors(number));
    }

}