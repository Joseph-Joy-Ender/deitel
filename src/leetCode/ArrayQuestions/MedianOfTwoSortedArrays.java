package leetCode.ArrayQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int count = 0;
     int firstArray = nums1.length;
     int secondArray = nums2.length;

     int[] mergedArray = new int[firstArray + secondArray];

        for (int k : nums1) {
            mergedArray[count++] = k;

        }

        for (int j : nums2) {
            mergedArray[count++] = j;

        }

        Arrays.sort(mergedArray);

        int total = mergedArray.length;
        if (total % 2 == 1){
            return (double) mergedArray[total / 2];
        }else {
            int middle1 = mergedArray[total / 2 -1];
            int middle2 = mergedArray[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }

    }

    public static void main(String[] args) {
      int[] nums1 = {1, 2};
      int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
