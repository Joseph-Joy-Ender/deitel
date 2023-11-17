package chapter6;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    public static void instructions(){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int number1 = secureRandom.nextInt(1, 9);
        int number2 = secureRandom.nextInt(1, 9);

        extracted(number1, number2, scanner);
    }

    private static void extracted(int number1, int number2, Scanner scanner) {
        System.out.println("How much is " + number1 + " times " + number2);
        int answer = scanner.nextInt();

        if (answer == number1 * number2){
            System.out.println("Very good!");
        }
        while (answer != number1 * number2){
            System.out.println("No. Please try again.");

            System.out.println("How much is " + number1 + " times " + number2);
             answer = scanner.nextInt();

            if (answer == number1 * number2){
                System.out.println("Very good!");

           }
        }
    }

    public static void secondQuestion(){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int answer;
        boolean con = true;

        int number1 = secureRandom.nextInt(1, 9);
        int number2 = secureRandom.nextInt(1, 9);

        while (con) {
            System.out.println("How much is " + number1 + " times " + number2);
             answer = scanner.nextInt();

            correctAnswer(answer, number1, number2);
            wrongAnswer(answer, number1, number2);
            questionRepetition(answer, number1, number2);

            System.out.println("Do you wish to continue?: (Yes/ No) ");
            String answers = scanner.next();
            if (answers.equalsIgnoreCase("no")){
                con = false;
            }else {
                questionRepetition(answer, number1, number2);
            }
        }

    }

    public static void questionRepetition(int answer, int number1, int number2){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        try {
            while (answer == number1 * number2){
                number1 = secureRandom.nextInt(1, 9);
                number2 = secureRandom.nextInt(1, 9);
                System.out.println("How much is " + number1 + " times " + number2);
                answer = scanner.nextInt();
                wrongAnswer(answer, number1, number2);
                correctAnswer(answer, number1, number2);

            }
        }catch (InputMismatchException exception){
            System.out.println("Wrong input");
            wrongAnswer(answer, number1, number2);

        }
    }

    public static void wrongAnswer(int answer, int number1, int number2){
        Scanner scanner = new Scanner(System.in);
        try {
            while (answer != number1 * number2) {
                System.out.println("No. Please try again.");
                System.out.println("How much is " + number1 + " times " + number2);
                answer = scanner.nextInt();
                correctAnswer(answer, number1, number2);
            }
        }catch (InputMismatchException exception) {
            System.out.println("Wrong input");
            wrongAnswer(answer, number1, number2);
        }
    }

    public static void correctAnswer(int answer, int number1, int number2){
        if (answer == number1 * number2){
            System.out.println("Very good!");

        }

    }

    public static void main(String[] args) {
        instructions();
        secondQuestion();
    }
}
