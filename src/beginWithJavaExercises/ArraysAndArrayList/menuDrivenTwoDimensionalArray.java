package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Scanner;

public class menuDrivenTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        System.out.println("Please enter a number and not anything else. Thank you!");

        System.out.println("Enter the size of row: ");
        row = scanner.nextInt();
        while (row < 1 || row > 99){
            System.out.println("Enter the size of row: ");
            row = scanner.nextInt();
        }

        System.out.println("Enter the size of column: ");
        column = scanner.nextInt();
        while (column < 1 || column > 99){

            System.out.println("Enter the size of column: ");
            column = scanner.nextInt();

        }

        int[][]arrayA = new int[row][column];
        int options;

        do {
            System.out.println("Menu ");
            System.out.println("1. input Array");
            System.out.println("2. Display Array");
            System.out.println("3. Sum of all elements of matrix row and column");
            System.out.println("4. display row-wise sum of matrix row and column");
            System.out.println("5. display the column-wise sum of matrix row and column");
            System.out.println("6. transpose of matrix row and column");
            System.out.println("7. Exit");
            System.out.print("Select an Option: ");
            options = scanner.nextInt();

            switch (options) {
                case 1 -> inputElement(arrayA);
                case 2 -> displayElement(arrayA);
                case 3 -> sumOfAllElement(arrayA);
                case 4 -> displayRowWiseSum(arrayA);
                case 5 -> columnWiseSum(arrayA);
                case 6 -> createTranspose(arrayA);

            }
        }    while (options != 7);


    }

    private static void inputElement(int[][] arrayA) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.println(" Enter row  " + (i + 1) + "\n " + "Enter column  " + (j + 1));
                arrayA[i][j] = scanner.nextInt();
            }
        }

    }

    private static void displayElement(int[][] arrayA) {
        for (int[] ints : arrayA) {
            for (int anInt : ints) {
                System.out.printf("%7d", anInt);

            }
            System.out.println();
        }
    }

    private static void sumOfAllElement(int[][] arrayA) {
        int sum = 0;
        for (int[] ints : arrayA) {
            for (int anInt : ints) {
                sum += anInt;

            }
        }
        System.out.println("The sum of the row and column is " + sum);
    }

    private static void displayRowWiseSum(int[][] arrayA) {
        int sum;
        for (int row = 0; row < arrayA.length; row++) {
            sum = 0;
            for (int col = 0; col < arrayA[row].length; col++) {
                sum += arrayA[row][col];

            }
            System.out.println("The sum of row " + (row + 1) + " = " + sum);
        }
    }

    private static void columnWiseSum(int[][] arrayA) {
        int cols = arrayA[0].length;
        int sumCol;
        for (int i = 0; i < cols; i++) {
            sumCol = 0;
            for (int[] ints : arrayA) {
                sumCol += ints[i];

            }
            System.out.println("The sum of column " + (i + 1) + " = " + sumCol);

        }

    }

    private static void createTranspose(int[][] arrayA) {
        int row = arrayA.length;
        int column = arrayA.length;
        int[][] transpose  = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[i][j] = arrayA[j][i];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(transpose[i][j] + "  ");

            }
            System.out.println();
        }
    }










}
