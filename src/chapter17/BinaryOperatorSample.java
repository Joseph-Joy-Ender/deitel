package chapter17;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (word, word2) -> word.concat(" "+word2);

        System.out.println(binaryOperator.apply("Oladeji", "djFemzy"));
    }
}
