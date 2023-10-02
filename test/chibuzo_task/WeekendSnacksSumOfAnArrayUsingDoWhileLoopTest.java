package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksSumOfAnArrayUsingDoWhileLoopTest {

    @Test
    public void testThatArrayCanBeSummedUsingDoWhileLoop(){
        int[] numbers = {12, 13, 14, 15, 16};
        assertEquals(70, WeekendSnacks.sumOfElementsUsingDoWhileLoop(numbers));
    }

    @Test
    public void secondTest(){
        int[] numbers = {11, 12, 21, 22};
        assertEquals(66, WeekendSnacks.sumOfElementsUsingDoWhileLoop(numbers));
    }

     @Test
    public void thirdTest(){
        int[] numbers = {9, 99, 76, 87, 90};
        assertEquals(361, WeekendSnacks.sumOfElementsUsingDoWhileLoop(numbers));
     }

     @Test
    public void fourthTest(){
        int[] numbers = {90, -9, 76, 66, 5};
        assertEquals(228, WeekendSnacks.sumOfElementsUsingDoWhileLoop(numbers));
     }
}