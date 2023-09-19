import chibuzorAssignment.MathematicsAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathematicsAssignmentsPalindromeTest {

    @Test
    public void testThatAFiveDigitsNumberIsAPalindrome(){
        int number = 11311;
        assertTrue(MathematicsAssignments.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThatNumberIsNotAPalindrome(){
        int number = 12345;
        assertFalse(MathematicsAssignments.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThat54145IsAPalindrome(){
        int number = 54145;
        assertTrue(MathematicsAssignments.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThat55555IsAPalindrome(){
        int number = 55555;
        assertTrue(MathematicsAssignments.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThat82528IsAPalindrome(){
        int number = 82528;
        assertTrue(MathematicsAssignments.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThat3443IsAPalindrome(){
        int number = 3443;
        assertTrue(MathematicsAssignments.palindrome(String.valueOf(number)));
    }
}