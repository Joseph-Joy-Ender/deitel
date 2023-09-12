package beginWithJavaExercises;

import java.util.Scanner;

public class WallPaintingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        int total = height * length * width;

        System.out.print("Enter number of doors: ");
        int numberOfDoors = scanner.nextInt();
        System.out.print("Enter number of windows: ");
        int numberOfWindows = scanner.nextInt();

      int  totalSquareFeetOfEachDoor = 20 * numberOfDoors;
       int totalSquareFeetOfEachWindow = 15 * numberOfWindows;

       int squareFeetPerGallon = (total * totalSquareFeetOfEachDoor * totalSquareFeetOfEachWindow) / 350;

        System.out.print("Total amount of paint needed to paint a room is: " + squareFeetPerGallon);

    }
}
