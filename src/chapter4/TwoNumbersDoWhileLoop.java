package chapter4;

import java.util.Objects;
import java.util.Scanner;

public class TwoNumbersDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean con = false;
        do {

            System.out.println("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;

            System.out.println("Sum of numbers is: " + sum);

            System.out.println("Do you want to perform the operation again?: ");
            String answer = scanner.next();
            scanner.nextLine();

            if (Objects.equals(answer, "yes")) con = true;
            else con = false;
        }
            while (con);

        }
    }
