package chapter7;

public class Turtle {
    private boolean penIsUp = true;
    private int row;
    private int column;
    private Direction direction;

    public TurtlePosition getCurrentPosition() {
        return new TurtlePosition(row, column);
    }

    public boolean penIsUp() {
        return penIsUp;

    }

    public boolean penIsDown() {
        return penIsUp = false;
    }

    public Direction getCurrentDirection() {
        return direction = Direction.North;
    }


    public void turnRight() {
        if (getCurrentDirection() == Direction.North){



        }

    }
}
