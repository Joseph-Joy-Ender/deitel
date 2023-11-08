package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void testForTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        assertEquals(new int[]{0, 1}, twoSum.twoSum(numbers, target));
    }

}