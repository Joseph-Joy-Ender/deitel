package leetCode.ArrayQuestions;

import java.util.Arrays;

public class OddlyPlacedArray {

    public static String oddPositions(int[] oddNumbers){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= oddNumbers.length; i++) {
            if (i % 3 != 0){
                result.append(oddNumbers[i - 1]).append(" ");

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arrays = {0, 5, 8, 11, 13, 9};
        System.out.println(Arrays.toString(new String[]{oddPositions(arrays)}));
    }
}
