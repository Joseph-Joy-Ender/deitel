package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeekendSnacksCombinedTwoListTest {


    @Test
    public void testThatTwoListCanBeCombined(){
        char[] chars = {'A', 'B', 'c', 'd'};
        int[] numbers = {1, 2, 12, 9};
        assertEquals("A, 1, B, 2, c, 12, d, 9 ", WeekendSnacks.combinedTwoList(chars, numbers));
    }

    @Test
    public void testTwo(){
        char[] chars = {'q', 'w', 'r', 'E'};
        int[] numbers = {12, 3, 4, 5};
        assertEquals("q, 12, w, 3, r, 4, E, 5", WeekendSnacks.combinedTwoList(chars, numbers));
    }

    @Test
    public void testThree(){
        char[] chars = {'z', 'V', 'l', 'H', 'p'};
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals("z, 1, V, 2, l, 3, H, 4, p, 5", WeekendSnacks.combinedTwoList(chars, numbers));
    }
}