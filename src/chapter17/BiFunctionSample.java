package chapter17;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> function = String::compareTo;

        System.out.println(function.apply("Joy", "Joseph"));
    }
}
