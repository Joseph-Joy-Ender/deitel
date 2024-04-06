package leetCode.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static leetCode.ArrayQuestions.SummingTwoNumbersInAnArray.toArray;

public class Hcf {

    public static int[] highestFactor(int[] numbers){
        List<Integer> result = new ArrayList<>();
        int number = numbers.length;
        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0){
                result.add(divisor);
                number = number / divisor;
              //  divisor = 2;
            }
            else {
                ++divisor;
            }
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while(number % i == 0) {
                    result.add(i);
                }
            }

            if( number > 2) {
                result.add(number);
            }

        }


        return toArray(result);
    }

    public static void main(String[] args) {

//        String[] cars = {"volvo", "Mercedes", "Bmw"};
//        for(String i : cars){
//            System.out.println(i);
//        }
        
        int[] numbers = {8,16,12};
        System.out.println(Arrays.toString(highestFactor(numbers)));
    }
}
