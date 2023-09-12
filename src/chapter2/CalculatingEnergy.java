package chapter2;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double energyMeasuredInJoules = water * (finalTemperature - initialTemperature) * 4184;
        System.out.print("The energy needed is " + energyMeasuredInJoules);
    }
}
