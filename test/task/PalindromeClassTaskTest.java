package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeClassTaskTest {

    @Test
    public void testThatAWordIsAPalindrome(){
        String word = "Anna";
        assertTrue(PalindromeClassTask.isPalindrome(word));
    }

    @Test
    public void testAnotherPalindrome(){
        String word = "Dad";
        assertTrue(PalindromeClassTask.isPalindrome(word));
    }

    @Test
    public void testThatAWordIsNotAPalindrome(){
        String word = "Grace";
        assertFalse(PalindromeClassTask.isPalindrome(word));
    }

}