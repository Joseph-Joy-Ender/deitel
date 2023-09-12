package chapter2;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed: ");
        double speed = scanner.nextInt();
        System.out.print("Enter acceleration: ");
        double acceleration = scanner.nextDouble();

        double length = (speed * speed) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}
