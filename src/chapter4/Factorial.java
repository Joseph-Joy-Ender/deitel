package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= value; i++) {
            total = total * i;

        }
        System.out.println(total);


    }
}
