package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.PositionValue.O;
import static ticTacToe.PositionValue.X;

class GameTest {

    @Test
    public void testThatAllCellsOnTheBoardAreEmptyAtStart() {
        Board board = new Board();
        assertTrue(board.isEmpty());


    }

    @Test
    public void testThatPlayerCanSetName(){
        Player player1 = new Player(X);
        Player player2 = new Player(O);
        player1.setName("Joseph");
        player2.setName("Qudus");
        assertEquals("Joseph", player1.getName());
        assertEquals("Qudus", player2.getName());
    }

    @Test
    public void checkThatTheGameCanBeUpdated() {
        Board board = new Board();
        board.updateBoard();

    }



}