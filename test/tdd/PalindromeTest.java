package tdd;

import tdd.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    public void testThatPalindromeExist() {
        assertNotNull(palindrome);
    }

    @Test
    void testThatPalindromeCanCollectInputOfTypeInt() {
        String actual = palindrome.check("12321");
        String expected = "12321";
        assertEquals(expected, actual);
    }
    @Test
    void testThatPalindromeCannotCollectMoreOrLessThanFiveInputs(){
        int actual = palindrome.integer(5);
        assertEquals(5, actual);
    }
    @Test
    void testThatIntegerIsReadFromFrontToBackAndViceVersa(){
        String same = palindrome.viceVersa("it is not a palindrome");
        String expected = "it is not a palindrome";
        assertEquals(same, expected);
    }
}