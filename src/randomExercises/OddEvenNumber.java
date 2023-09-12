package randomExercises;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        if (number / 2 == 0) {
            System.out.println("Even number");
        } else {
            // (number / 2 == 1) {
            System.out.println("Odd number");

            if (number / 2 == 0) {
                System.out.print("Number is an even number");
            } else {
                System.out.println("Number is an odd number");
            }
            if (number / 2 == 0) {
                System.out.println("Even number");
            }
            if (number / 2 == 1) {
                System.out.println("Odd number");
            }
        }
    }
}
