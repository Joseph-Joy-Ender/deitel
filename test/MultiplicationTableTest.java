import chapter4.MultiplicationTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableTest {

    @Test
    public void testThatFirstNumberCanMultiplySecondNumber(){
        int number1 = 3;
        int number2 = -3;
        assertEquals(-9, MultiplicationTable.multiply(number1, number2));
    }
}
