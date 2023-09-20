package chapter4;

import java.util.Scanner;

public class AreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = (sides * side * side) / (4 * (Math.tan(Math.PI/ sides)));

        System.out.println("The area of the polygon is " + area);
    }

}
