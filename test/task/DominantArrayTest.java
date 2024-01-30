package task;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static task.DominantArray.*;

public class DominantArrayTest {

    @Test
    public void testThatAnArrayIsDominant(){
        int[] input = {9, 3, 10, 7, 4};
        int[] result = findDominantElements(input);
        assertArrayEquals(result, new int[]{10, 7, 4});
    }
}
