package chibuzo_task;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class MinMaxOfAnArrayNumbers {

    @Contract(pure = true)
    public static int max(@NotNull int[] max) {
        int maximum = max[0];
        for (int j : max) {
            if (j > maximum) {
                maximum = j;
            }
        }
        return maximum;
    }

    @Contract(pure = true)
    public static int min(@NotNull int[]min){
        int minimum = min[0];
        for (int j : min) {
            if (j < minimum) {
                minimum = j;
            }
        }
        return minimum;
    }

    @Contract(pure = true)
    public static int sum(@NotNull int[]summation){
        int total = 0;
        for (int j : summation) {
            total += j;

        }
        return total;
    }

    @NotNull
    @Contract("_ -> new")
    public static int[] minMax(int[] number){
        int maximum = sum(number) - min(number);
        int minimum = sum(number) - max(number);
        return new int[]{maximum, minimum};
    }

    public static void main(String[] args) {
        int[] numbers = {12, 32, 45, 76, 9};
        System.out.println(Arrays.toString(minMax(numbers)));


    }
}