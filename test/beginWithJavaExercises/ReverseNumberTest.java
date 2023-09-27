package beginWithJavaExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    public void testThatICanReverse12345To54321(){
        int number = 12345;
        assertEquals(54321, ReverseNumber.reverseNumber(number));
    }

    @Test
    public void testThatICanReverse9321To51239(){
        int number = 93215;
        assertEquals(51239, ReverseNumber.reverseNumber(number));
    }

    @Test
    public void testThatWhenIReverseANegativeNumberIGetZero(){
        int number = -12345;
        assertEquals(0, ReverseNumber.reverseNumber(number));
    }

    @Test
    public void testThatWhenIReverse3456IGet6543(){
        int number = 3456;
        assertEquals(6543, ReverseNumber.reverseNumber(number));
    }

    @Test
    public void testThatNumbersCanBeReversed(){
        int number = 987654;
        assertEquals(456789, ReverseNumber.reverseNumber(number));
    }

}