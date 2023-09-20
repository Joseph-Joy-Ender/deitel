package chapter4;

import java.util.Scanner;

public class AreaOfPentagon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center of a vertex: ");
        double length = scanner.nextDouble();

        double side = ((2 * length) * (Math.sin(Math.PI / 5)));

        double area = ((5 * side * side) / (4 * Math.tan(Math.PI / 5)));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
