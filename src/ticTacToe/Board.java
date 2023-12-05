package ticTacToe;

import java.util.Arrays;

import static ticTacToe.PositionValue.EMPTY;


public class Board {
    private PositionValue constant;

    int count = 0;
    private final String[][] boards = new String[3][3];
    public Board(){
        initializeArrayToEmpty();
    }

    private void initializeArrayToEmpty() {
        for (String[] strings: boards) {
            Arrays.fill(strings, EMPTY.toString());

        }
    }



    public boolean isEmpty(){
        for (String[] board : boards) {
            for (String string : board) {
                if (!(string.equals(EMPTY.toString()))) return false;

            }

        }
        return true;
    }


    }
