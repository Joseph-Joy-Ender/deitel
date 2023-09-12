package randomExercises;

import java.util.Arrays;

public class JoyExercise3 {
    public static void main(String[] args) {
        int[][] result = new int[3][4];

        System.out.print("S/N" + " ");
        System.out.print("Square" + " ");
        System.out.print("Cube" + " ");
        System.out.println();

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result.length; j++) {
                result[i][j] = i;
            }
        }

        System.out.println(Arrays.toString(result[0]));
    }
}
