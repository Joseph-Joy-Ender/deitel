package randomExercises;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();

        for (int number = 1; number <= 100 ; number++) {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }

        }
    }
}