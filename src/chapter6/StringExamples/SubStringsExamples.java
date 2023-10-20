package chapter6.StringExamples;

import java.util.Arrays;

public class SubStringsExamples {
    public static void main(String[] args) {

        String example1 = "unhappy";
        System.out.println(example1.substring(2));
        System.out.println("Harrison".substring(3));
        System.out.println("Emptiness".substring(9));
        System.out.println("hamburger".substring(4, 8));
        System.out.println("Smiles".substring(1, 5));
        System.out.println(example1.concat("."));
        System.out.println(example1.replace("u", "U"));
        String name = "boo : and : foo";
        System.out.println(Arrays.toString(name.split("o", -2)));
        System.out.println(name.trim());
        System.out.println(name.strip());
    }
}
