package chibuzo_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {

    @Test
    public void testThatNumberCanBeConvertedFromBinaryToDecimal(){
        String binaryNumber = "100110";
        assertEquals(38, BinaryAndDecimalConversion.binaryToDecimal(binaryNumber) );
    }

    @Test
    public void testThatBinaryNumberCanBeConvertedToDecimal(){
        String binaryNumber = "11011";
        assertEquals(27, BinaryAndDecimalConversion.binaryToDecimal(binaryNumber));
    }

}