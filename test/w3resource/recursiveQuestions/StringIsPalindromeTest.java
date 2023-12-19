package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIsPalindromeTest {
    @Test
    void testThatAGivenStringIsPalindrome(){
        StringIsPalindrome isPalindrome = new StringIsPalindrome();
        String palindrome1 = "madam";
        assertTrue(isPalindrome.stringIsPalindrome(palindrome1));
    }

    @Test
    void testThatAnotherGivenStringIsPalindrome(){
        StringIsPalindrome isPalindrome = new StringIsPalindrome();
        String palindrome1 = "level";
        assertTrue(isPalindrome.stringIsPalindrome(palindrome1));
    }

    @Test
    void testThatAGivenStringIsNotPalindrome(){
        StringIsPalindrome isPalindrome = new StringIsPalindrome();
        String palindrome1 = "java";
        assertFalse(isPalindrome.stringIsPalindrome(palindrome1));
    }

}