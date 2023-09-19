package chapter4;

import java.util.Scanner;

public class AreaOfAHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of a hexagon: ");
        double side = scanner.nextDouble();

        double area = (6 * Math.sqrt(side)) / 4 * Math.tan(Math.PI/ 6);

        System.out.println("The area of a hexagon is " + area);
    }
}
