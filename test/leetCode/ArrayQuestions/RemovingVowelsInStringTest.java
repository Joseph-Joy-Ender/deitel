package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static leetCode.ArrayQuestions.RemovingVowelsInString.word;
import static org.junit.jupiter.api.Assertions.*;

class RemovingVowelsInStringTest {

    @Test
    public void testThatTheVowelsInASentenceCanBeRemoved(){
        String word = "Joseph Joy";
        String result = "JSPH JY";
        assertEquals(result, word(word));
    }

    @Test
    public void ThatTheVowelsInASentenceCanBeRemovedTest(){
        String word = "Joseph Joy Ender";
        String result = "JSPH JY NDR";
        assertEquals(result, word(word));
    }

}