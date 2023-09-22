import chapter4.MultiplyingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyingNumberTest {

    @Test
    public void testThatFirstNumberCanMultiplySecondNumber(){
        int number1 = 3;
        int number2 = -3;
        assertEquals(-9, MultiplyingNumber.multiply(number1, number2));
    }
}
