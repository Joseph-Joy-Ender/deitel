package ticTacToe;

public enum PositionValue {

    X("X"),
    O("O"),
    EMPTY(" ");

    private final String symbol;
    PositionValue(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
