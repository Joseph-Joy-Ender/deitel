package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassExamplesTest {



    @Test
    public void testThatWeCanSumTheArrayNumbers(){
        ArrayClassExamples arrayClassExamples = new ArrayClassExamples();
        int[] numbers = {1, 2, 3, 4, 5, 6, 10};
        int sum = arrayClassExamples.sum(numbers);
        assertEquals(31, sum);

    }

@Test
    public void testThatWeCanMultiplyTheArrayNumbers(){
        ArrayClassExamples arrayClassExamples = new ArrayClassExamples();
        int[] ints = {2, 4, 6};
        int product = (int) arrayClassExamples.multiply(ints);
        assertEquals(48, product);
}

@Test
    public void testThatWeCanGetTheAverageOfTheArrayNumbers(){
        ArrayClassExamples arrayClassExamples = new ArrayClassExamples();
        int[] ints = {2, 4, 6};
        int average = arrayClassExamples.average(ints);
        assertEquals(4, average);
}
@Test
    public void testThatAnArrayCanBeSwapped(){
        ArrayClassExamples arrayClassExamples = new ArrayClassExamples();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = arrayClassExamples.swap(numbers);
        int[] expected = {3, 4, 1, 2, 5};
        assertEquals(expected, result);
}
}