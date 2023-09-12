package beginWithJavaExercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= number ; i++) {
            total *= i;

        }
        System.out.println("Factor is " + total);
    }
}
