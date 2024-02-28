package chapter17;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = String::toLowerCase;

        System.out.println(unaryOperator.apply("JAMES"));
    }
}
