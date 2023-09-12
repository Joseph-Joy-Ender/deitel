package chapter2;

import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting velocity in meters per seconds: ");
        double velocity0 = scanner.nextDouble();
        System.out.print("Enter ending velocity in meters per seconds: ");
        double velocity1 = scanner.nextDouble();
        System.out.print("Enter time: ");
        double time = scanner.nextDouble();

        double acceleration = (velocity1 - velocity0) / time;

        System.out.printf("The average acceleration is %.4f" , acceleration);


    }
}
