package chapter17;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorSample {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100", "2", "30", "4", "5", "1");

        Map<String, Integer> map = numbers.stream()
                .collect(Collectors.toMap(
                        (element)->element,
                        String::length)
                );

        System.out.println(map);
    }
}
