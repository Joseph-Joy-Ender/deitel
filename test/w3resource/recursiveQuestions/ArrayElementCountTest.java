package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementCountTest {
    @Test
    void testNumberOfOccurrencesOfANumber(){
        Integer[] numbers = {10, 20, 30, 40, 20, 50, 20, 60};
        int target = 20;
        ArrayElementCount count = new ArrayElementCount();
        int occurrences = count.countOccurrence(numbers, target);
        assertEquals(3, occurrences);
    }

    @Test
    void testNumberOfOccurrencesOfANumberInAnArray(){
        Integer[] numbers = {10, 20, 10, 40, 20, 50, 10, 60};
        int target = 10;
        ArrayElementCount count = new ArrayElementCount();
        int occurrences = count.countOccurrence(numbers, target);
        assertEquals(3, occurrences);
    }

}