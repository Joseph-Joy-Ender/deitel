package chibuzorAssignment.MathematicsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testThatAFiveDigitsNumberIsAPalindrome(){
        int number = 11311;
        assertTrue(Palindrome.palindrome(String.valueOf(number)));
    }

    @Test
    public void testThatNumberIsNotAPalindrome(){
        int number = 12345;
        assertFalse(Palindrome.palindrome(String.valueOf(number)));
    }
}