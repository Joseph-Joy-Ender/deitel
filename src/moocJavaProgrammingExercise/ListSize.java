package moocJavaProgrammingExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(14);
        integers.add(20);
        integers.add(50);
        integers.add(54);

        System.out.println(integers.size());
    }
}
