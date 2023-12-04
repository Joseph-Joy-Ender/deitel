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
    public void testThatPlayersCanMakeMove(){
        Game game = new Game();

        Player player1 = new Player(X);
        Player player2 = new Player(O);


    }



}