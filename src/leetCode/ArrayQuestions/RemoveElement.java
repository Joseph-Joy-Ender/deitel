package leetCode.ArrayQuestions;

public class RemoveElement {

    public static int removeElement(int[] nums, int target){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target){
                nums[counter] = nums[i];
                counter++;
            }

        }
        return counter;
    }


    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;
        System.out.println(removeElement(numbers, target));
    }
}
