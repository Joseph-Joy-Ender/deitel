package chapter4;

import java.util.Scanner;

public class FindingTheLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten integers: ");

        int largestNumber = scanner.nextInt();

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter ten integers: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber > largestNumber) largestNumber = secondNumber;

        }
        System.out.println("Largest number is " + largestNumber);
    }
}
