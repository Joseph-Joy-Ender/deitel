package tdd;

import chapter4.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private final Television television = new Television();

    @Test
    public void testThatTelevisionExists(){
        assertNotNull(television);
    }

    @Test
    public void testThatTelevisionCanBeTurnedOn(){
        assertFalse(television.getTurnOn());
        television.powerOn();
        assertTrue(television.getTurnOn());
    }

    @Test
    public void testThatTelevisionCanBeTurnedOff(){
        television.powerOn();
        assertTrue(television.getTurnOn());
        television.powerOn();
        assertFalse(television.getTurnOn());
    }

    @Test
    public void testThatTelevisionCanIncreaseVolume(){
        television.powerOn();
        television.increasedVolume();
        assertEquals(13, television.getInitialVolume());
    }
}
