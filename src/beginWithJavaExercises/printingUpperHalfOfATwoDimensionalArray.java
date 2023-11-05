package beginWithJavaExercises;

public class printingUpperHalfOfATwoDimensionalArray {


    public static void upperHalf(int column, int row){
        int[][] array = new int[column][row];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("* ");

            }

        }
    }

    public static void main(String[] args) {

    }
}
