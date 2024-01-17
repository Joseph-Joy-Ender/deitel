package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static leetCode.ArrayQuestions.SquareOfArrayAndAscendingOrder.squareOfArray;
import static org.junit.jupiter.api.Assertions.*;

class SquareOfArrayAndAscendingOrderTest {

    @Test
    void testThatAnArrayCanBeSquaredAndThenReturnedInAscendingOrder(){
        int[] array = {2, 7, 8, 12, 4};
        int[] result = {4, 16, 49, 64, 144};
        assertArrayEquals(result, squareOfArray(array));
    }

    @Test
    void ThatAnArrayCanBeSquaredAndThenReturnedInAscendingOrderTest(){
        int[] array = {-3, 2, 3, 4, 5, 6, 7};
        int[] result = {4, 9, 9, 16, 25, 36, 49};
        assertArrayEquals(result, squareOfArray(array));
    }



}