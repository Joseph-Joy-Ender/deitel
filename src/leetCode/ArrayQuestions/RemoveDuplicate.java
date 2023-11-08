package leetCode.ArrayQuestions;

public class RemoveDuplicate {
    public int removeDuplicate(int[] numbers) {
        int j = 1;
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] != numbers[i -1]) {
                numbers[j] = numbers[i];
                j++;

            }

        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate.removeDuplicate(nums));
    }
}
