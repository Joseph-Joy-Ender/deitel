package task;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static java.math.BigInteger.ZERO;

public class ArrayClassExamples {

    public  int sum (@NotNull int[] numbers){
        int sum = 0;
        for (int index = ZERO.intValue(); index < numbers.length; index++) {
            sum += numbers[index];
        }
        return sum;
    }

    public static double multiply(@NotNull int[] numbers) {
        int product = 1;
        for (int i = ZERO.intValue(); i < numbers.length ; i++) {
            product *= numbers[i];
        }
        return product;
    }

    public int average(int[] ints) {
            return sum(ints) / ints.length;

        }

        public int[] swap(int[] numbers){
        int temp;
            for (int i = 0; i < numbers.length; i++) {
                if (i < numbers.length - 3){
                    temp = numbers[i];
                    numbers[i] = numbers[i + 2];
                    numbers[i + 2] = temp;
                }

            }
            return numbers;
        }

        public static int[] swaps(int[] numbers, int secondNumber){
            for (int i = 0; i < numbers.length; i++) {
                int firstNumber = numbers[i];
                numbers[i] = numbers[secondNumber];
                numbers[secondNumber] = firstNumber;

            }
            return numbers;
        }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int second = 2;
        System.out.println(ArrayClassExamples.multiply(numbers));
    }
}
