package moocJavaProgrammingExercise;

import java.util.Arrays;

public class EvenNumbersArrays {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 3;
        }

        System.out.println(Arrays.toString(numbers));


    }
}
