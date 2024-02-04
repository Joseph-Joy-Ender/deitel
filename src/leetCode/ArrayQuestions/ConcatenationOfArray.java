package leetCode.ArrayQuestions;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums){
        int num = nums.length;
        int[] newLength = new int[num * 2];
        for (int i = 0; i < num; i++) {
            newLength[i] = nums[i];
            newLength[i + num] = nums[i];

        }
        return newLength;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
