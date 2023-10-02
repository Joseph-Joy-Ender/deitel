package moocJavaProgrammingExercise;

import java.util.Arrays;

public class EvenNumbersArrays {
    public static void main(String[] args) {

//        int[] numbers = {2, 4, 6, 8, 10};
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] *= 3;
//        }
//
//        System.out.println(Arrays.toString(numbers));


        int[] evenNumbers = {2, 3, 4, 5, 6, 7, 9};
        int even = 0;
        for (int i = 0; i < evenNumbers.length; i++) {
            if (i % 2 == 0) {
                even++;

                evenNumbers[i] = evenNumbers[even];
            }
        }
            System.out.println(Arrays.toString(evenNumbers));

    }
}
