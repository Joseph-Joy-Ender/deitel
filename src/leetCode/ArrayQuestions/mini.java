package leetCode.ArrayQuestions;

import java.util.Arrays;

public class mini {

    public static int[] minimum(int[] array){

//        int[] num = new int[array.length];
        int number = array[0];
        int minimum = array[0];
        for (int j : array) {
            if (j > number) {
                number = j;
            }
            if (j < minimum) minimum = j;
        }
        return new int[]{number, minimum};
//        return array;
    }

    public static void main(String[] args) {
        
        int[] numbers = {12, 3, 5, 7, 10};
        System.out.println(Arrays.toString(minimum(numbers)));
    }
}
