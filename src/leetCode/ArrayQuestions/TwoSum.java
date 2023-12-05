package leetCode.ArrayQuestions;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int num = numbers.length;
        for (int i = 0; i < num -1; i++) {
            for (int j = i + 1; j < num ; j++) {
                if (numbers[i] + numbers[j] == target) return new int[]{i, j};

            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum.twoSum(numbers, target)));

    }
}
