package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksRunningTotalTest {

    @Test
    public void testThatTotalCanBeGottenWhileRunning(){
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals("[1, 3, 6, 10, 15]", WeekendSnacks.runningTotalOfAList(numbers));
    }

    @Test
    public void secondTest(){
        int[] numbers = {5, 4, 3, 2, 1};
        assertEquals("[5, 9, 12, 14, 15]", WeekendSnacks.runningTotalOfAList(numbers));
    }

    @Test
    public void thirdTest(){
        int[] numbers = {10, 20, 30, 40};
        assertEquals("[10, 30, 60, 100]", WeekendSnacks.runningTotalOfAList(numbers));
    }

    @Test
    public void fourthTest(){
        int[] numbers = {40, -90, 30, 20, 10};
        assertEquals("[40, -50, -20, 0, 10]", WeekendSnacks.runningTotalOfAList(numbers));
    }
 }