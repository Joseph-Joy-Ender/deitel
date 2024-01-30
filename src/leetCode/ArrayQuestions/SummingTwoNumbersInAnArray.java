package leetCode.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummingTwoNumbersInAnArray {

    public static int [] sumNumbersInArray(int[] numbers){
        List<Integer> result = new ArrayList<>();
        int total = 0;
        int counter = 1;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            if (counter % 2 == 0){
                result.add(total);
                total = 0;
            }
            if (counter % 2 != 0 && i == numbers.length - 1){
                result.add(numbers[1]);
            }
            counter++;
        }
        return toArray(result);
    }

    private static int[] toArray(List<Integer> result) {
        int [] toArray = new int[result.size()];
        for(int count = 0 ; count < result.size(); count++){
            toArray[count] = result.get(count);
        }
        return toArray;
    }

    public static void main(String[] args) {
        int[] number = {2, 3, 5, 6, 7, 2};
        System.out.println(Arrays.toString(sumNumbersInArray(number)));
    }
}
