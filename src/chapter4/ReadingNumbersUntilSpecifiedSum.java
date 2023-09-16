package chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int initialNumber = scanner.nextInt();

        int total = 0;

        while (total < initialNumber) {
            System.out.println("Enter numbers: ");
            int number = scanner.nextInt();
            total += number;

        }
        System.out.println(total);


    }
}