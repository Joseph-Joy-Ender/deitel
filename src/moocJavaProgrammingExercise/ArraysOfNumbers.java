package moocJavaProgrammingExercise;

import java.util.Arrays;

public class ArraysOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int sums = 0;
    int [] numbers = new int[30];
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 30 ; i++) {
           numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        int total = numbers.length;
        System.out.println(total);

        for (int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        for (int i = 5; i <= 10; i++) {
            sums += numbers[i];

        }
        System.out.println(sums);
    }
}
