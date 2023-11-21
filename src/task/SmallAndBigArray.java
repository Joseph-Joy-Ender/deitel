package task;

import java.util.Arrays;

public class SmallAndBigArray {

    public static int[] bigSmall(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0){
                if (i == nums.length - 1){

                }
            }
          //  for (int j = 0; j < nums.length - i - 1; j++) {
//                if (){
//                    if (j % 2 != 0) {
//                        int temp = nums[j + i];
//                        nums[i + j] = nums[j + 1];
//                        nums[j + 1] = temp;
//                    }
//
//                }

          //  }

        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {42, 18, 41, 22, 15, 12};
        System.out.println(Arrays.toString(bigSmall(nums)));
    }
}
