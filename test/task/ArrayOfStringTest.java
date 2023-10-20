package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfStringTest {

    @Test
    public void testThatNumberOfDigitsInAStringArrayIsReturned(){
        String[] input = {"ABC21F", "13cpz", "A1l"};
        assertEquals(5, ArrayOfString.stringArray(input));
    }

    @Test
    public void testForAdditionOfAllDigitsInAnArray(){
        String[] input = {"ABC21F2", "13CPZ0", "A1L6"};
        assertEquals(8, ArrayOfString.arrayToString(input));
    }

}