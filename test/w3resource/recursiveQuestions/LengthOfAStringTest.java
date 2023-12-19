package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfAStringTest {
    @Test
    void testForLengthOfAString(){
        LengthOfAString string = new LengthOfAString();
        String word = "Java exercises!";
        int length = string.lengthOfString(word);
        assertEquals(15, length);
    }

    @Test
    void testForLengthOfAnotherString(){
        LengthOfAString string = new LengthOfAString();
        String word = "Java exercises and dietel!";
        int length = string.lengthOfString(word);
        assertEquals(26, length);
    }

}