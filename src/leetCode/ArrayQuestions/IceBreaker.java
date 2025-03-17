package leetCode.ArrayQuestions;

import java.util.Arrays;

public class IceBreaker {

    public int[] iceBreaker(int[] arr) {
        // use a filterc
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }else arr[i] = 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        IceBreaker ib = new IceBreaker();
        int[] arr = {4, 5, 8, 8, 8, 2, 9};
        System.out.println(Arrays.toString(ib.iceBreaker(arr)));
    }
}
