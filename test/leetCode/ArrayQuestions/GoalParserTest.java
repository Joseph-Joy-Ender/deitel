package leetCode.ArrayQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalParserTest {
    @Test
    void testThatACommandCanBeInterpreted(){
        GoalParser goalParser = new GoalParser();
        String command = "G()(al)";
        String expected = "Goal";
        assertEquals(expected, goalParser.interpret(command));
    }

    @Test
    void testThatASecondCommandCanBeInterpreted(){
        GoalParser goalParser = new GoalParser();
        String command = "G()()()()(al)";
        String expected = "Gooooal";
        assertEquals(expected, goalParser.interpret(command));
    }

    @Test
    void testThatAThirdCommandCanBeInterpreted(){
        GoalParser goalParser = new GoalParser();
        String command = "(al)G(al)()()G";
        String expected = "alGalooG";
        assertEquals(expected, goalParser.interpret(command));
    }

}