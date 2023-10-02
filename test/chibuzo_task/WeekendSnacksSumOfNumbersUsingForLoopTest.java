package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksSumOfNumbersUsingForLoopTest {

    @Test
    public void testThatNumbersInAnArrayCanBeSummed(){
        int[] numbers = {12, 32, 54, 76};
        assertEquals(174, WeekendSnacks.sumOfElementUsingForLoop(numbers));
    }

    @Test
    public void testForASummedArrayNumbers(){
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, WeekendSnacks.sumOfElementUsingForLoop(numbers));
    }

    @Test
    public void anotherTest(){
        int[] numbers = {32, 33, 12, 9, 0};
        assertEquals(86, WeekendSnacks.sumOfElementUsingForLoop(numbers));
    }

}