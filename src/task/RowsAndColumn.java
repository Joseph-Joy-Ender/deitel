package task;

public class RowsAndColumn {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            System.out.print("#");
            for (int column = 1; column <= row ; column++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
