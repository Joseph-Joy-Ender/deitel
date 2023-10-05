package beginWithJavaExercises;

public class TwoDimArrayMethods {
    public void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%7d", matrix[row][col]);

            }
            System.out.println();
        }
    }

    public void sumRows(int[][] matrix){
        int sum;
        for (int row = 0; row < matrix.length; row++) {
            sum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];

            }
            System.out.println("The sum of row " + (row + 1) + " = " + sum);
        }
    }
    public void largestInRows(int[][] matrix){
        int largest;
        for (int row = 0; row < matrix.length; row++) {
            largest = matrix[row][0];
            for (int col = 1; col < matrix[row].length ; col++) {
                if (largest < matrix[row][col]){
                    largest = matrix[row][col];
                }
            }
            System.out.println("The largest element of row " + (row + 1) + " = " + largest);

        }
    }

    public static void main(String[] args) {
        TwoDimArrayMethods operate = new TwoDimArrayMethods();
        int[][] board = {{20, 15, 6, 19, 18}, {4, 46, 24, 17, 18}, {12, 50, 23, 16, 31}};
        operate.printMatrix(board);
        System.out.println();
        operate.sumRows(board);
        System.out.println();
        operate.largestInRows(board);
    }
}