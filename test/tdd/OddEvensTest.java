package tdd;

import chapter4.OddEvens;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvensTest {

    private final OddEvens oddEvens = new OddEvens();

    @Test
    void testThatOddEvensCannotTakeNumberLessThan0(){
        oddEvens.negativeNumber(-1);
        assertEquals(0, oddEvens.getNegativeNumber());
    }

    @Test
    void testThatOddEvensCanTakePositiveNumber(){
        oddEvens.negativeNumber(10);
        assertEquals(10, oddEvens.getNegativeNumber());
    }
    @Test
    void testThatOddEvenCanCalculateEvenNumber(){
        oddEvens.oddNumber(33);
        assertEquals(0, oddEvens.getNumber());
    }


}
