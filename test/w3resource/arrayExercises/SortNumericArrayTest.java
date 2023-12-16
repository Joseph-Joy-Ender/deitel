package w3resource.arrayExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortNumericArrayTest {
    @Test
    void testThatANumericArrayCanBeSorted(){
        SortNumericArray sorted = new SortNumericArray();
        int[] array = {21, 33, 54, 9, 6, 1};
        assertArrayEquals(new int[]{1, 6, 9, 21, 33, 54}, sorted.sortNumericArray(array));
    }

}