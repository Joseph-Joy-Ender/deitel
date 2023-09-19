package tdd;

import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsAssignmentsIsEvenTest {

            @Test
        public void testThatNumberEnteredIsEven(){
            int number = 22;
            assertTrue(MathematicsAssignments.isEven(number));
        }

        @Test
        public void testThatNumberEnteredIsOddAndFalse(){
            int number = 43;
            assertFalse(MathematicsAssignments.isEven(number));
        }

        @Test
    public void testThat5IsNotAnEvenNumber(){
                int number = 5;
                assertFalse(MathematicsAssignments.isEven(number));
        }

        @Test
    public void testThat10IsAnEvenNumber(){
                int number = 10;
                assertTrue(MathematicsAssignments.isEven(number));
        }

}