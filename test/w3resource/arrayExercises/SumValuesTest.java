package w3resource.arrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumValuesTest {
    @Test
    void testThatValuesOfAnArrayCanBeSummed(){
        SumValues values = new SumValues();
        int[] arrays = {2, 3, 4, 5, 6};
        assertArrayEquals(new int[]{20}, values.sumAnArray(arrays));
    }

    @Test
    void testThatMoreValuesOfAnArrayCanBeSummed(){
        SumValues values = new SumValues();
        int[] arrays = {2, 3, 4, 5, 6, 7, 8, 9, 12, 54};
        assertArrayEquals(new int[]{110}, values.sumAnArray(arrays));
    }

    @Test
    void testThatNegativeValuesOfAnArrayCanBeSummed(){
        SumValues values = new SumValues();
        int[] arrays = {-2, -3, -4, -5, -6};
        assertArrayEquals(new int[]{-20}, values.sumAnArray(arrays));
    }

}