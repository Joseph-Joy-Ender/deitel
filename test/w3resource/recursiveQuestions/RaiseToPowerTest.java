package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaiseToPowerTest {

    @Test
    void testThatExponentCanBeCalculated(){
        double base = 3.5;
        int expo = 4;
        RaiseToPower raise = new RaiseToPower();
        assertEquals(150.0625, raise.raiseToPower(base, expo));
    }

}