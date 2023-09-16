package chapter4;

import java.util.Scanner;

public class AverageOfSetOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of integer: ");
        int number = scanner.nextInt();

        int average = 0;
        int total = 0;
        int count = 0;

        boolean con = true;
        System.out.println("Do you wish to continue: ");
        String answer = scanner.next();
        scanner.nextLine();
        if (answer.equals("no")) con = false;
        while (con) {
            System.out.println("Enter a set of integer: ");
            number = scanner.nextInt();

            total = total + count;

            count += 1;

            average = total / count;

            System.out.println("Do you wish to continue: ");
            answer = scanner.next();
            scanner.nextLine();
            if (answer.equals("no")) con = false;

        }
            System.out.println("The average of number is: " + average);

    }
}