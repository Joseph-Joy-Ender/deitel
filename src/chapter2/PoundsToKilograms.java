package chapter2;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double number = scanner.nextDouble();

        double onePounds = 0.454;
        double kilogram = number * onePounds;

        System.out.printf(number + " pounds is " + kilogram + " kilograms");
    }
}
