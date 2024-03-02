package chapter17;


import java.util.Comparator;
import java.util.List;

public class ComparatorUsingLambdas {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 67, 54, 9, 1, 4, 2);
        Comparator<Integer> comparator = ComparatorUsingLambdas::compare;

        List<Integer> nums = numbers.stream()
                                    .sorted(comparator)
                                    .toList();

        System.out.println(nums);


    }

    private static int compare(Integer a, Integer b){
        if (b > a) return 1;
        else if (a > b) {
            return -1;
        }
        return 0;
    }
}
