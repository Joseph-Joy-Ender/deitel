package programizPro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation to make use of(eg. +, -)");
        String op = scanner.nextLine();

        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();

        switch (op) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "/" -> System.out.println(first / second);
            case "*" -> System.out.println(first * second);
            default -> System.out.println("Invalid operator");
        }
        scanner.close();
    }
}
