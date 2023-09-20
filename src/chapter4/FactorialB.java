package chapter4;

import java.util.Scanner;

public class   FactorialB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double e = 1;
        for (int i = 1; i <= number; i++) {
            e += (double) 1 /(factorial(i));
        }

        System.out.println(e);

    }
    private static int factorial(int input){
        if (input <= 1) return 1;
        int sum = 1;
        for (int count = input; count >= 1 ; count--) {
            sum *= count;
        }
        return sum;
    }
}
