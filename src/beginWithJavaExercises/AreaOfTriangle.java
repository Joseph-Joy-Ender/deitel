package beginWithJavaExercises;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side: ");
        double a = scanner.nextDouble();

        System.out.println("Enter second side: ");
        double b = scanner.nextDouble();

        System.out.println("Enter third side: ");
        double c = scanner.nextDouble();

        double s;
        double area;

        s =  (a + b + c) / 2;

        area = Math.sqrt(s)*(s - a) * (s - b) * (s - c);

        System.out.printf("Area of a triangle is %.5f ", area);
    }
}
