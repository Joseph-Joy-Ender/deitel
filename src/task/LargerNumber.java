package task;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);

        System.out.println("Larger number is: " + max);
        System.out.println("Smaller number is: " + min);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

    }
}
