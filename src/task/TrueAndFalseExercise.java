package task;

import java.util.Scanner;

public class TrueAndFalseExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("(age > 13 && age < 18) is " + (age > 13 && age < 18));

        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter pounds: ");
        int pounds = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        System.out.println("Enter inches: ");
        int inches = scanner.nextInt();

        System.out.println("(weight > pounds && height > inches) is " + (weight > pounds && height > inches ));




    }
}
