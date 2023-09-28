package programizPro;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter an array element: ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
