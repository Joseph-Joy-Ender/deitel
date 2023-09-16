package chapter4;

import java.util.Scanner;

public class FactorialC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter x: ");
        int x = scanner.nextInt();

        double e = 1;
        for (int i = 0; i <= number ; i++) {
            e += (double)(int) (Math.pow(x, i))/ (factorial(number));
        }
        System.out.println(e);
    }
    private static int factorial(int input){
        int sum = 1;
        if (input <= 1) return 1;
        for (int count = input; count >= 1 ; count--) {
            sum *= count;

        }
        return sum;
    }
}
