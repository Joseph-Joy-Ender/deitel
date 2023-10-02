package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksEvenPositionTest {

    @Test
    public void testForEvenPositionInAList(){
        int[] numbers = {12, 13, 14, 15};
        assertEquals("13 15", WeekendSnacks.evenPositions(numbers));
    }

}