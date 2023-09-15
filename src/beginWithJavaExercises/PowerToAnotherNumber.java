package beginWithJavaExercises;

import java.util.Scanner;

public class PowerToAnotherNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter value number: ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= power ; i++) {
            result *= base;

        }
        System.out.println("Result: " + result);
    }
}
