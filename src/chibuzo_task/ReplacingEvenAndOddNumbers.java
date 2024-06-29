package chibuzo_task;

import java.util.Arrays;

public class ReplacingEvenAndOddNumbers {

    public static int[] replaceEvenAndOdd(int[] array){
        int[] ans = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                ans[i] = 1;
            }else ans[i] = 0;


        }
        return ans;
    }

    public static Boolean[] replaceEvenOddWithTrueOrFalse(int[] array){
        Boolean[] ans = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0){
             ans[i] = false;
           }else ans[i] = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] result = {4, 5, 8, 8, 8, 3, 9};
        System.out.println(Arrays.toString(replaceEvenAndOdd(result)));
    }
}
