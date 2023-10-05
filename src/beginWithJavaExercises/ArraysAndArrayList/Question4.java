package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list1 = new int[5];
        int[] list2 = new int[5];

        int[] numbers = new int[list1.length];
        for (int i = 0; i < list1.length; i++) {
            System.out.println("Enter numbers " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
            list1[i] = numbers[i];
            list2 = list1;
        }

        System.out.println(Arrays.toString(list2));

    }
}
