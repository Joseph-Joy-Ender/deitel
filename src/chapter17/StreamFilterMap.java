package chapter17;

import java.util.stream.IntStream;

public class StreamFilterMap {
    public static void main(String[] args) {
        System.out.printf("Sum of triples of even numbers from 1 through 10: %d%n",
                IntStream.rangeClosed(1, 10)
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 3)
                        .sum()
        );
    }
}
