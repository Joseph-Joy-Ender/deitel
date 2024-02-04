package leetCode.ArrayQuestions;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[target] == i){
                return nums[target];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
     int[] nums = {1};
     int target = 1;

        System.out.println(search(nums, target));
    }
}
