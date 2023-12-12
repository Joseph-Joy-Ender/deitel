package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangAnIpAddressTest {
    @Test
    void testThatIpAddressCanBeDefanged(){
        DefangAnIpAddress defangAnIpAddress = new DefangAnIpAddress();
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, defangAnIpAddress.defangIPAddress(address));

    }

    @Test
    void testThatAnotherIpAddressCanBeDefanged(){
        DefangAnIpAddress defangAnIpAddress = new DefangAnIpAddress();
        String address = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        assertEquals(expected, defangAnIpAddress.defangIPAddress(address));

    }


}