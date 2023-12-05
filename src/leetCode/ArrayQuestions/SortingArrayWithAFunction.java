package leetCode.ArrayQuestions;

import java.util.Arrays;

public class  SortingArrayWithAFunction {

    public int[] sortArray(int[] nums){
        return Arrays.stream(nums).sorted().toArray();
    }

    public static void main(String[] args) {
        SortingArrayWithAFunction sorting = new SortingArrayWithAFunction();
        int[] nums = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(sorting.sortArray(nums)));
    }
}
