package chibuzo_task;

import chibuzo_task.WeekendSnacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksElementOccurrenceTest {

    @Test
    public void testThatANumberOccursInAList(){
        int[] numbers = {12, 32, 76, 89, 90, 13};
        int number = 90;
        assertTrue(WeekendSnacks.elementOccurrenceInAList(numbers, number));
    }

    @Test
    public void testThatANumberDoesNotExistInAnElement(){
        int[] numbers = {-12, 78, 65, 43};
        int number = 88;
        assertFalse(WeekendSnacks.elementOccurrenceInAList(numbers, number));
    }

    @Test
    public void testingThatANumberExistInAList(){
        int[] numbers = {-13, 23, 43, 65};
        int number = -13;
        assertTrue(WeekendSnacks.elementOccurrenceInAList(numbers, number));
    }

}