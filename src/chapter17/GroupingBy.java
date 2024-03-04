package chapter17;

import java.util.Set;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100", "200", "400", "2", "30", "4", "5", "1", "20", "40");

        System.out.println(numbers.stream()
                .collect(Collectors.groupingBy(String::length)));
    }
}
