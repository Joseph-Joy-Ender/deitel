package programizPro;

import java.util.Scanner;

public class AverageOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double average;
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter array elements: ");
            numbers[i] = scanner.nextInt();
        }

        for (double number : numbers) {
            sum += number;

        }
        average = sum / numbers.length;

        System.out.println("The average of the elements of numbers is: " + average);
    }
}
