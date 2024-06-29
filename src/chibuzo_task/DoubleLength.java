package chibuzo_task;

import java.util.Arrays;

public class DoubleLength {

    public static int[] doubleLength(int[] array){
        int[] newArray = new int[array.length];
        int[] doubles = new int[array.length];
        int[] ans = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray = array;
            doubles[i] = array[i] * 2;

        }
        return doubles;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 8};
        System.out.println(Arrays.toString(doubleLength(array)));
    }
}
