package leetCode.ArrayQuestions;

import java.util.Arrays;

public class SquareOfArrayAndAscendingOrder {

    public static int[] squareOfArray(int[] array){
        int[] newNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newNumbers[i] = array[i] * array[i];

        }
       return SortingInAscendingOrder.sortArray(newNumbers);

    }

}
