package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = new int[10];

        int sum = 0;
        for (int i = 0; i < size.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":" );
            int numbers = scanner.nextInt();
            sum += size[i] = numbers;
        }
        System.out.println("The sum of numbers is: " + sum);
    }
}
