package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifyStringTest {

    @Test
    public void testThatFullStopIsAddedToTheEndOfAWord(){
        String result = BeautifyString.addFullStop("Joy");
        assertEquals("Joy.", result);
    }

    @Test
    public void testThatTheFirstLetterIsCapitalize(){
        String result = BeautifyString.capitalizeLetter("joy");
        assertEquals("Joy", result);
    }

    @Test
    public void testABeautifiedString(){
        String result = BeautifyString.beautifiedString("i am joy");
        assertEquals("I am joy.", result);
    }
}
