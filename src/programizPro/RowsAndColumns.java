package programizPro;

import java.util.Arrays;
import java.util.Scanner;

public class RowsAndColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores;


        scores = new int[][]{{80, 50, 60}, {11, 12, 17}, {40, 13, 19}};
        System.out.println(Arrays.deepToString(scores));

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {

                System.out.print(scores[row][column] + "|" + " ");
            }
            System.out.println();
        }
    }
}
