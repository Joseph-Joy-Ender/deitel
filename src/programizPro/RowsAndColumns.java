package programizPro;

import java.util.Arrays;
import java.util.Scanner;

public class RowsAndColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][3];

//        scores[0][0] = 8;
//        scores[0][1] = 5;
//        scores[0][2] = 16;
//        scores[1][0] = 9;
//        scores[1][1] = 10;
//        scores[1][2] = 11;
//        scores[2][0] = 11;
//        scores[2][1] = 12;
//        scores[2][2] = 7;

        scores = new int[][]{{8, 5, 6}, {1, 2, 7}, {4, 3, 9}};
      //  System.out.println(Arrays.deepToString(scores));

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {

                System.out.print(scores[row][column] + " ");
            }
            System.out.println();
        }
    }
}
