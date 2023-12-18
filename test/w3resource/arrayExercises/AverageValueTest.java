package w3resource.arrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueTest {

    @Test
    void testThatAnArrayCanCalculateTheAverage(){
        AverageValue value = new AverageValue();
        int[] arrays = {2, 3, 4, 5, 6};
        assertArrayEquals(new int[]{5}, value.averageValue(arrays));
        ;
    }
}