package chapter17;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionSample {
    public static void main(String[] args) {
        LongToDoubleFunction toDoubleFunction = (longs) -> longs;

        System.out.println(toDoubleFunction.applyAsDouble(123456789L));
    }
}
