package beginWithJavaExercises;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        int angles = side1 + side2 + side3;
        int degrees = 180;

        if (angles == degrees) {
            System.out.println("Triangle is valid");
        }else {
            System.out.println("Triangle is not valid");
        }
    }
}
