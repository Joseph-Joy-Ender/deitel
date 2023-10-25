package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LowestCommonDivisorTest {

    @Test
    public void testThatLowestCommonDivisorIsGiven(){
        int[] results = {2, 5};
        assertArrayEquals(results, LowestCommonDivisor.lowestCommonDivisor(10));
    }
}
