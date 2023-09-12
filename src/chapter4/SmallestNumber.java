package chapter4;

import java.util.Objects;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int value = scanner.nextInt();

        int largestNumber = value;
        int smallestNumber = value;

        boolean con = true;
        System.out.println("Do you wish to continue?");
        String answer = scanner.next();
        scanner.nextLine();


        if (answer.equals("no")) con = false;

        while (con) {
            System.out.println("Enter numbers: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber > largestNumber) largestNumber = secondNumber;
            if (secondNumber < smallestNumber) smallestNumber = secondNumber;

            System.out.println("Do you wish to continue?");
            answer = scanner.next();
            scanner.nextLine();

            if (Objects.equals(answer, "no")) con = false;
        }
        System.out.println("Largest number is: " + largestNumber);
        System.out.println("Smallest number is: " + smallestNumber);
    }
}