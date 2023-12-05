package leetCode.ArrayQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = Arrays.stream(nums1).sorted().toArray();
        int[] secondResult = Arrays.stream(nums2).sorted().toArray();


        int[] merged = IntStream.concat(Arrays.stream(result), Arrays.stream(Arrays.stream(secondResult).toArray())).toArray();





        return 0;

    }
}
