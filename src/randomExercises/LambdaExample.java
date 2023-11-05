package randomExercises;

import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(54);
        numbers.add(44);


        numbers.forEach(System.out::println);
    }
}
