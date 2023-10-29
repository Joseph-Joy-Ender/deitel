package beginWithJavaExercises;

import java.util.Arrays;

import static java.math.BigInteger.ZERO;

public class TwoDimArrayMethods {
    public void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%7d", anInt);

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

    public void sumOfColumn(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] columnSum = new int[cols];
        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int[] ints : matrix) sum += ints[i];
            columnSum[i] = sum;

        }
        System.out.println("The sum of column " + " = " + Arrays.toString(columnSum));

    }



    public static void main(String[] args) {
        TwoDimArrayMethods operate = new TwoDimArrayMethods();
        int[][] board = {{20, 15, 6, 19, 18}, {4, 46, 24, 17, 18}, {12, 50, 23, 16, 31}};
        operate.printMatrix(board);
        System.out.println();
        operate.sumRows(board);
        System.out.println();
        operate.largestInRows(board);
        operate.sumOfColumn(board);

    }
}
