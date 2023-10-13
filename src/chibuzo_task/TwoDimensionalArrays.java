package chibuzo_task;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%7d", matrix[row][col]);

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = scanner.nextInt();
//        System.out.println("Enter column: ");
//        int column = scanner.nextInt();
//
//        int[][] board = new int[row][column];
//        for (int i = 0; i < board.length; i++) {
//            System.out.println("enter the row and column: " + (i + 1));
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = scanner.nextInt();
//            }
//        }
//            printMatrix(board);
        System.out.println("Enter the number of customers: ");
        int customers = scanner.nextInt();

        System.out.println("Enter the total number of items bought by customers: ");
        int items = scanner.nextInt();

        int[][] rowAndColumn = new int[customers][items];
        for (int i = 0; i < rowAndColumn.length; i++) {
            System.out.println("enter customer " + (i + 1)+ ":" + " price of Items " + (i + 1) + ":");
            for (int j = 0; j < rowAndColumn[i].length; j++) {
                rowAndColumn[i][j] = scanner.nextInt();
            }



        }

        System.out.println("The customers and items are: ");
        for (int j = 0; j < customers; j++) {
            for (int k = 0; k < items; k++) {
                System.out.print(rowAndColumn[j][k] + "     ");

            }
            System.out.println();
        }


        }
    }

