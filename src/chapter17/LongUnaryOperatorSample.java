package chapter17;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = (longUnary) -> longUnary * 2;

        System.out.println(longUnaryOperator.applyAsLong(1234567891L));
    }
}
