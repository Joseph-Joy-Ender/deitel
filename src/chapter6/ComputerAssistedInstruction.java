package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    public static void instructions(){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int number1 = secureRandom.nextInt(1, 9);
        int number2 = secureRandom.nextInt(1, 9);

        System.out.println("How much is " + number1 + " times " + number2);
        int answer = scanner.nextInt();

        if (answer == number1 * number2){
            System.out.println("Very good!");
            secondQuestion();
        }
        while (answer != number1 * number2){
            System.out.println("No. Please try again.");

            System.out.println("How much is " + number1 + " times " + number2);
             answer = scanner.nextInt();

            if (answer == number1 * number2){
                System.out.println("Very good!");
              //  secondQuestion();
            }

            secondQuestion();
        }
    }

    public static void secondQuestion(){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int number1 = secureRandom.nextInt(1, 9);
        int number2 = secureRandom.nextInt(1, 9);

        System.out.println("How much is " + number1 + " times " + number2);
        int answer = scanner.nextInt();


        while (answer == number1 * number2) {

             number1 = secureRandom.nextInt(1, 9);
             number2 = secureRandom.nextInt(1, 9);

            System.out.println("How much is " + number1 + " times " + number2);
            answer = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        instructions();
    }
}
