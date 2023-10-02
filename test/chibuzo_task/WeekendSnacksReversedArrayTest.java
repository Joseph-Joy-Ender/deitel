package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksReversedArrayTest {

    @Test
    public void testThatAnArrayCanBeReversed(){
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals("[5, 4, 3, 2, 1]", WeekendSnacks.reversedArray(numbers));
    }

    @Test
    void testForReversedArray(){
        int[] numbers ={9, 8, 7, 6};
        assertEquals("[6, 7, 8, 9]", WeekendSnacks.reversedArray(numbers));
    }

    @Test
    public void testForNegativeReversedArray(){
        int[] numbers = {7, -8, 4, 3};
        assertEquals("[3, 4, -8, 7]", WeekendSnacks.reversedArray(numbers));
    }
}