package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendSnacksConcatenatingTwoListsTest {

    @Test
    public void testThatTwoElementsCanConcatenate(){
        int[] numbers = {1, 2, 3};
        char[] ch = {'a', 'b', 'c'};
        assertEquals("a, b, c, 1, 2, 3", WeekendSnacks.concatenatingTwoLists(ch, numbers));
    }

    @Test
    public void testTwoElements(){
        int[] numbers = {23, 32, 43};
        char[] ch = {'a', 'b', 'c'};
        assertEquals("a, b, c, 23, 32, 43", WeekendSnacks.concatenatingTwoLists(ch, numbers));
    }

    @Test
    public void testForMultiplyNumbers(){
        int[] numbers = {12, 13, 14, 15, 16};
        char[] ch = {'a', 'b', 'd', 'z', 'p', 'y'};
        assertEquals("a, b, d, z, p, y, 12, 13, 14, 15, 16", WeekendSnacks.concatenatingTwoLists(ch, numbers));
    }

    @Test
    public void testForLastTime(){
        char[] chars = {'Q', 'O', 'P', 't'};
        int[] numbers = {12, -90, 76, 77};
        assertEquals("Q, O, P, t, 12, -90, 76, 77", WeekendSnacks.concatenatingTwoLists(chars, numbers));
    }
}