package chapter2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0){
            int remainder = number % 10;
             number = number / 10;
             sum += remainder;
        }
        System.out.println("The sum of digits is " + sum);
    }
}
