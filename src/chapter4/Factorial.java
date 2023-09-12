package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int total = 1;

        for (int i = 1; i <= number; i++) {
            total = total * i;

        }
        System.out.println(total);

    }
}