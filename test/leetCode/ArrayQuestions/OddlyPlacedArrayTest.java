package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddlyPlacedArrayTest {

    @Test
    public void testForOddPositionsInAnArray(){
        int[] numbers = {10, 5, 3, 4, 50, 6, 7};
        assertEquals("1 3 5 7", OddlyPlacedArray.oddPositions(numbers));
    }

}