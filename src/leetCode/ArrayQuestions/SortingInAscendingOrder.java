package leetCode.ArrayQuestions;

import java.util.Arrays;

public class SortingInAscendingOrder {
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }

        }
        return nums;
    }

    public static void main(String[] args) {
        SortingInAscendingOrder sorting = new SortingInAscendingOrder();
        int[] nums = {38, 89, 20, 99, 54, 12};
        System.out.println(Arrays.toString(sorting.sortArray(nums)));
    }
}
