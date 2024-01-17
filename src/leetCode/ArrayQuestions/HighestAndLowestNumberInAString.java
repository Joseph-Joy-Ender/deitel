package leetCode.ArrayQuestions;

import java.util.Arrays;

public class HighestAndLowestNumberInAString {

    public static int[] highest(String number){
        int[] numbers = new int[2];
        int biggest = numbers[0];
        int smallest = numbers[0];

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > biggest) biggest = numbers[i];
//            if (numbers[i] < smallest) smallest = numbers[i];
////            if (i < smallest) smallest = i;
//
//        }
        return numbers ;
    }



    public static void main(String[] args) {

        String numbers = "1 8 3 2 10";
        System.out.println(Arrays.toString(highest(numbers)));
    }
}
