package randomExercises;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds * 0.453592;

        System.out.printf("Weight in kilograms is %.6f%n " , kilogram);
    }
}
