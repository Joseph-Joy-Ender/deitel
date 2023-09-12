package chapter1;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isNumberPrime(int number) {

        for (int i = 2; i <= (number - 1); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = isNumberPrime(number);

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
