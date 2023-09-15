package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();

        int maximum = number;
        int minimum = number;

        boolean condition = true;

        System.out.println("Press(Yes) for continuation and(No) to stop: ");
        String answer = scanner.next();
        scanner.nextLine();

        if (answer.equals("No")) condition = false;

        int total = 0;
        while (condition) {

            System.out.println("enter numbers: ");
            int secondNumber = scanner.nextInt();

            if (secondNumber > maximum) maximum = secondNumber;
            if (secondNumber < minimum) minimum = secondNumber;

            System.out.println("Press(Yes) for continuation and(No) to stop: ");
            answer = scanner.next();
            scanner.nextLine();

            if (answer.equals("No")) condition = false;


            total = maximum + minimum;
        }
        System.out.println("maximum number is " + maximum);
        System.out.println("Minimum number is " + minimum);
        System.out.println("The sum of two extremes is " + total);
    }
}
