package chapter17;

import java.util.List;

public class FlatMapSample {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(10, 20, 30),
                List.of(100, 200, 300),
                List.of(1000, 2000, 3000)
        );
/*
        System.out.println(Arrays.toString(lists.stream()
                .flatMap(Collection::stream)
                .toArray()));
        System.out.println(lists.stream()
                .mapToLong(Collection::size)
                .sum());
*/


        List<String> phrases = List.of(
                "1asj_+", "hate87", "uyo98", "jo7sy"
        );
        var result =
        phrases.stream()
                .flatMap((phrase) -> phrase.chars().boxed())
                .filter(c -> c >= 48 && c <= 57)
                .count();

        System.out.println(result);
    }
}
