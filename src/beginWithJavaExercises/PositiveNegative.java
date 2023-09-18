package beginWithJavaExercises;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        System.out.println("Enter a number or '-99' to end the program: ");
        int number = scanner.nextInt();

        while (number != -99){
            if (number > 0)positiveCount++;
             else if (number < 0)negativeCount++;
            else zeroCount++;

            System.out.println("Enter a number or '99' to end the program: ");
            number = scanner.nextInt();


        }

        System.out.println("Positive numbers are: " + positiveCount);
        System.out.println("Negative numbers are: " + negativeCount);
        System.out.println("Zero numbers are: " + zeroCount);
    }
}
