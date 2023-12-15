package chapter7;

public class TurtlePosition {
    private int rowPosition;
    private int columnPosition;
    public TurtlePosition(int row, int column) {
        this.rowPosition = row;
        this.columnPosition = column;
    }

    public String toString(){
       return "row " + rowPosition + " " + "column " + columnPosition;
    }

    public boolean equals(Object turtlePosition){
        if (this.getClass() != turtlePosition.getClass()) return false;
        TurtlePosition compared = (TurtlePosition) turtlePosition;
        if (this.rowPosition == compared.rowPosition && this.columnPosition == compared.columnPosition) {
            return true;
        }
            return super.equals(turtlePosition);

    }
}
