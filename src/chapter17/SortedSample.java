package chapter17;

import java.util.List;

public class SortedSample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 2, 30, 4, 5, 1, 1, 5, 2);

        List<Integer> nums = numbers.stream()
                                    .distinct()
                                    .sorted()
                                    .toList();

        System.out.println(nums);
    }
}
