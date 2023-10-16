package programizPro;

import java.util.Scanner;

public class EvenNumbersArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = scanner.nextInt();

        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
