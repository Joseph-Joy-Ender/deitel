package beginWithJavaExercises;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number entered is an even number");
        } else {
            System.out.println("Number entered is an odd number");
        }

    }
}
