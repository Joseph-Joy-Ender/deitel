package educative;

import java.util.Arrays;

public class SumOfThreeValues {

    public static boolean findSumOfThree(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            for (int index2 = index + 1; index2 < nums.length; index2++) {
                for (int index3 = index2 + 1; index3 < nums.length; index3++) {
                    if (nums[index] + nums[index2] + nums[index3] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean findSumOfThrees(int[] nums, int target) {
        Arrays.sort(nums);
        int low, high, triples;

        for (int i = 0; i < nums.length - 2; i++) {
            low = i + 1;
            high = nums.length - 1;

            while (low < high) {
                triples = nums[i] + nums[low] + nums[high];

                if (triples == target) {
                    return true;
                }
                else if (triples < target) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }

        return false;
    }

    public static int[] sortColors (int[] colors) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length - i - 1; j++) {
                if (colors[j] > colors[j + 1]){
                    int temp = colors[j];
                    colors[j] = colors[j + 1];
                    colors[j + 1] = temp;
                }

            }

        }
        return colors;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 2, 0, 2, 1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
