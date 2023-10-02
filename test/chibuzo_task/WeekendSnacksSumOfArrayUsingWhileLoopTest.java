package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksSumOfArrayUsingWhileLoopTest {

    @Test
    public void testThatNumberCanBeSummedUsingWhileLoop(){
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, WeekendSnacks.sumOfElementsUsingWhileLoop(numbers));
    }

    @Test
    public void testNumberTwo(){
        int[] numbers = {0, 8, 9, 1, 2};
        assertEquals(20, WeekendSnacks.sumOfElementsUsingWhileLoop(numbers));
    }

    @Test
    public void testNumberThree(){
        int[] numbers = {9, -8, 2, 3, 7};
        assertEquals(13, WeekendSnacks.sumOfElementsUsingWhileLoop(numbers));
    }

    @Test
    public void testNumberFour(){
        int[] numbers = {90, 80, 70, 60, 50, 40};
        assertEquals(390, WeekendSnacks.sumOfElementsUsingWhileLoop(numbers));
    }
}