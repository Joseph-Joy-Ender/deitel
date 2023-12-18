package w3resource.recursiveQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
    @Test
    void testThatAWordCanBeReversed(){
        ReverseAString string = new ReverseAString();
        String word = "Java, World!";
        String reversed = string.reversedString(word);
        assertEquals("!dlroW ,avaJ", reversed);
    }

    @Test
    void testThatMoreWordsCanBeReversed(){
        ReverseAString string = new ReverseAString();
        String word = "love";
        String reversed = string.reversedString(word);
        assertEquals("evol", reversed);
    }

}