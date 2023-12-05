package ticTacToe;

public class Player {
   private PositionValue positionValue;
   private String name;
    public Player(PositionValue positionValue) {
        this.positionValue = positionValue;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
