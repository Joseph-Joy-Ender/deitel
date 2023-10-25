package randomExercises;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int number = input.nextInt();
        int total = 0;
        for (int i = 1; i <= number ; ++i) {
            total = total + i;
        }
            System.out.println("The sum of 10 natural numbers = " + total);
            input.close();

    }
}
