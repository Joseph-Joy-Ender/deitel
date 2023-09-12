package beginWithJavaExercises;

public class RectangularPattern {
    public static void main(String[] args) {

        int maxRows = 7;
        int maxColumn = 10;

        for (int i = 1; i <= maxRows ; i++) {
            for (int j = 1; j <= maxColumn ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        int row = 6;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
