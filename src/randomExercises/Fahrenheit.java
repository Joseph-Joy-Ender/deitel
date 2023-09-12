package randomExercises;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double Celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("The Celsius is %.4f%n " , Celsius);
    }
}
