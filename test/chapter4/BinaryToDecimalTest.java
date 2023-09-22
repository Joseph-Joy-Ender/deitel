package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {

    @Test
    public void testThatBinaryNumber1101Is13InDecimal(){
        int binary = 1101;
        assertEquals(13, BinaryToDecimal.convertBinaryToDecimal(binary));
    }

    @Test
    public void testThatBinaryNumber11011Is27InDecimal(){
        int binary = 11011;
        assertEquals(27, BinaryToDecimal.convertBinaryToDecimal(binary));
    }

}