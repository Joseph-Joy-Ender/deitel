package tdd;

import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathematicsAssignmentsIsSquareTest {



    @Test
    public void testThat4IsASquareNumber(){
        int number = 4;
        Assertions.assertTrue( MathematicsAssignments.isSquare(number));

    }

    @Test
    public void testThat9IsASquareNumber(){
        int number = 9;
        assertTrue(MathematicsAssignments.isSquare(number));
    }

    @Test
    public void testThat16IsASquareNumber(){
        int number = 16;
        assertTrue(MathematicsAssignments.isSquare(number));
    }

    @Test
    public void testThat25IsASquareNumber(){
        int number = 25;
        assertTrue(MathematicsAssignments.isSquare(number));
    }

    @Test
    void testThat31IASquareNumber(){
        int number = 31;
        assertFalse(MathematicsAssignments.isSquare(number));
    }
}