package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksLargestElementsTest {

    @Test
    public void testForLargestElement(){
        int[] numbers = {43, 54, 65, 78, 85, 88, 92, 10};
        assertEquals(92, WeekendSnacks.largestElement(numbers));
    }

    @Test
    public void testTheLargestElementInAList(){
        int[]numbers = {12, 14, -90, 43, 88, 29, -88};
        assertEquals(88, WeekendSnacks.largestElement(numbers));
    }

    @Test
    public void anotherTest(){
        int[]numbers = {-90, -77, 12, 13, 15, 17};
        assertEquals(17, WeekendSnacks.largestElement(numbers));
    }

}