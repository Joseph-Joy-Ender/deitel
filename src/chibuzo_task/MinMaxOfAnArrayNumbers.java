package chibuzo_task;

import java.util.Arrays;

public class MinMaxOfAnArrayNumbers {

    public static int max(int[] max) {
        int maximum = max[0];
        for (int j : max) {
            if (j > maximum) {
                maximum = j;
            }
        }
        return maximum;
    }

    public static int min(int[]min){
        int minimum = min[0];
        for (int j : min) {
            if (j < minimum) {
                minimum = j;
            }
        }
        return minimum;
    }

    public static int sum(int[]summation){
        int total = 0;
        for (int j : summation) {
            total += j;

        }
        return total;
    }

    public static int[] minMax(int[] number){
        int maximum = sum(number) - min(number);
        int minimum = sum(number) - max(number);
        return new int[]{maximum, minimum};
    }

    public static void main(String[] args) {
        int[] number = {5, 3, 4, 2, 1};
        System.out.println(Arrays.toString(minMax(number)));
    }
}