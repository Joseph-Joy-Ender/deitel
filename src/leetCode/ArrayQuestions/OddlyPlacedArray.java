package leetCode.ArrayQuestions;

import java.util.Arrays;

public class OddlyPlacedArray {

    public static String oddPositions(int[] oddNumbers){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= oddNumbers.length; i++) {
            if (i % 2 != 0){
                result.append(oddNumbers[i - 1]).append(" ");

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(new String[]{oddPositions(arrays)}));
    }
}
