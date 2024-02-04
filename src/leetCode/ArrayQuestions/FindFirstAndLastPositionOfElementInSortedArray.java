package leetCode.ArrayQuestions;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {


    public static int[] searchRange(int[] nums, int target){
       int[] num = SortingInAscendingOrder.sortArray(nums);
        int numb = num.length;
        for (int i = 0; i < numb -1; i++) {
            for (int j = i + 1; j < numb ; j++) {
                if (nums[i] == target && nums[j] == target) return new int[]{i, j};

            }

        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        //int[] numbers = {};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(numbers, target)));

    }
}
