package chapter4;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int values = scanner.nextInt();

        int maximumNumber = values;
        int minimumNumber = values;

        boolean con = true;
        System.out.println("Do you wish to continue: ");
        String answer = scanner.next();
        scanner.nextLine();
        if (answer.equals("no")) con = false;

        while (con){
            System.out.println("Enter numbers: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber > maximumNumber) maximumNumber = secondNumber;
            if (secondNumber < minimumNumber) minimumNumber = secondNumber;

            System.out.println("Do you wish to continue: ");
            answer = scanner.next();
            scanner.nextLine();

            if (answer.equals("no")) con = false;

        }

        System.out.println("Maximum number is " + maximumNumber);
        System.out.println("Minimum number is " + minimumNumber);

    }
}
