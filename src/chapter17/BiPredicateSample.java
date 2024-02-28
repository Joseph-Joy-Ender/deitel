package chapter17;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = String::equals;

        System.out.println(predicate.test("Joy", "Joe"));
    }
}
