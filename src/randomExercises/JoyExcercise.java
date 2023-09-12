package randomExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JoyExcercise {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        int[] squares = new int[30];
        int[] cubes = new int[30];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < squares.length; i++) {
            squares[i] = (int)Math.pow(i, 2);
        }

        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = (int)Math.pow(i, 3);
        }
        System.out.print("S/N" + " ");
        System.out.print("Square" + " ");
        System.out.print("Cube" + " ");
        System.out.println();
        for (int i = 0; i < cubes.length; i++) {
            System.out.print(numbers[i] + "     ");
            System.out.print(squares[i] + "     ");
            System.out.print(cubes[i] + "     ");
            System.out.println();
        }

    }
}
