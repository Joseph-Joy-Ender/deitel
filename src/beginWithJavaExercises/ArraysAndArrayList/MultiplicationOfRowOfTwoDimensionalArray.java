package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Scanner;

public class MultiplicationOfRowOfTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][6];
        int multiply;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println(" Enter row  " + (row + 1) + "\n " + "Enter column  " + (column + 1));
                        array[row][column] = scanner.nextInt();
            }

        }

        for (int[] ints : array) {
            multiply = 1;
            for (int anInt : ints) {
                multiply *= anInt;

            }
            System.out.println(multiply);
        }

    }
}
