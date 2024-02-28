package chapter17;

import java.util.function.LongToIntFunction;

public class LongToIntSample {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = Math::toIntExact;

        System.out.println(longToIntFunction.applyAsInt(2193456));
    }
}
