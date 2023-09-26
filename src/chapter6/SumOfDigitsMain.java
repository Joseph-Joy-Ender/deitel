package chapter6;

import java.util.Scanner;

public class SumOfDigitsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digits integers: ");
        int number = scanner.nextInt();
            System.out.println(SumOfDigits.sumOfDigits(number));
        }
    }

