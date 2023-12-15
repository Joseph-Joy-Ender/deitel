package chapter7;

import org.junit.jupiter.api.Test;

import static chapter7.Direction.North;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    @Test
    void testThatTheDefaultPositionOfTheTurtleIsZeroZero(){
        Turtle turtle = new Turtle();
        TurtlePosition turtlePosition = new TurtlePosition(0,0);
        TurtlePosition position = turtle.getCurrentPosition();
        assertEquals(turtlePosition, position);
    }

    @Test
    void testThatTheTurtlePenIsUp(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }
    @Test
    void testThatTheTurtlePenIsDown(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
        turtle.penIsDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    void testThatWhenThePenGoesUpAndItCanComeDown(){
        Turtle turtle = new Turtle();
        turtle.penIsUp();
        assertFalse(turtle.penIsDown());
        turtle.penIsUp();
        turtle.penIsDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    void testThatTheDefaultDirectionOfTheTurtleIsNorth(){
        Turtle turtle = new Turtle();
        Direction direction = turtle.getCurrentDirection();
        assertEquals(North, direction);
    }

    @Test
    void testThatTheTurtleCanTurnRightAndTheCurrentDirectionWouldBeEast(){
        Turtle turtle = new Turtle();
        assertEquals(Direction.North, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.East, turtle.getCurrentDirection());
    }

}