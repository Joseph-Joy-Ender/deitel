package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSumTest {
    @Test
    void calculateSumOfNUsingRecursion(){
        CalculateSum sum = new CalculateSum();
        int number = 7;
        int sums = sum.calculateSum(number);
        assertEquals(28, sums);
    }

    @Test
    void calculateSumOf10UsingRecursion(){
        CalculateSum sum = new CalculateSum();
        int number = 10;
        int sums = sum.calculateSum(number);
        assertEquals(55, sums);
    }

    @Test
    void calculateSumOfNegativeNumber(){
        CalculateSum sum = new CalculateSum();
        int number = -7;
        int sums = sum.calculateSum(number);
        assertEquals(0, sums);
    }

}