package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static leetCode.ArrayQuestions.MostOccurrence.mostOccurrence;
import static org.junit.jupiter.api.Assertions.*;

class MostOccurrenceTest {


    @Test
    public void testElementOccurrence(){
        int[] numbers = {3, 4, 5, 5};
        assertEquals(5, mostOccurrence(numbers));
    }

    @Test
    public void testElementOccurrenceAgain(){
        int[] numbers = {2, 1, 1, 1, 1, 1, 2, 2};
        assertEquals(1, mostOccurrence(numbers));
    }



}