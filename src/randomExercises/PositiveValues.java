package randomExercises;

import java.util.Scanner;

public class PositiveValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first numbers: ");
        for (int i = 0; i < 5; i++) {

        }
        int number = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < 5; i++) {

            // positiveCounter = 0;
            // negativeCounter = 0;
            // zeroCounter = 0;

            if (number < 0) {
                negative = negative + 1;

            }
            // for (int b = 0; i < 5; i++) {
            if (number > 0) {
                positive = positive + 1;
            }
            //   for (int i = 0; i < 5; i++) {
            if (number == 0) {
                zero = zero + 1;
            }
        }
      //  System.out.println("Positive values: " + positive);
       // System.out.println("Negative values: " + negative);
       // System.out.println("Zero values: " + zero);
       // System.out.println(positive);
       // System.out.println(negative);
       // System.out.println(zero);
//            }
    }
}