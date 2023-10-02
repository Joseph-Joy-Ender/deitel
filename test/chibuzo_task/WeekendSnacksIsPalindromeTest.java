package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WeekendSnacksIsPalindromeTest {

    @Test
    public void checkThatAStringIsPalindrome(){
        String example = "Madam";
        assertTrue(WeekendSnacks.isPalindrome(example));
    }

    @Test
    public void secondTest(){
        String example = "Lawal";
        assertTrue(WeekendSnacks.isPalindrome(example));
    }

    @Test
    public void testThatAStringIsNotAPalindrome(){
        String example = "Adeshina";
        assertFalse(WeekendSnacks.isPalindrome(example));
    }

    @Test
    public void testFour(){
        String example = "Lol";
        assertTrue(WeekendSnacks.isPalindrome(example));
    }

    @Test
    public void testFive(){
        String example = "Joy";
        assertFalse(WeekendSnacks.isPalindrome(example));
    }
}