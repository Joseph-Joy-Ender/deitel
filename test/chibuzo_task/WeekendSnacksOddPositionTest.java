package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksOddPositionTest {

    @Test
    public void testForOddPositionsInAnArray(){
        int[] numbers = {12, 13, 14, 15, 16, 17};
        assertEquals("12, 14, 16", WeekendSnacks.oddPositions(numbers));
    }

}