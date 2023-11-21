package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberGame {


    public static void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        boolean condition = true;
        while (true){
            System.out.println("Guess a number between 1 and 15: ");
            int guessedNumber = scanner.nextInt();

            int guess = 1 + secureRandom.nextInt(1, 15);

            if (guessedNumber > guess){
                System.out.println("Too high, try again.");
            } else if (guessedNumber < guess) {
                System.out.println("Too low, Try again.");
            }

            if (guessedNumber == guess){
                System.out.println("Congratulations. You guessed the number!");
                playAgain();
            }

        }

    }

    public static void playAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (y/n) ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")){
            guessTheNumber();
        }else {
            System.exit(0);
        }
        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("N")){
            System.out.println("Wrong input!!");
            System.out.println("Do you want to play again? (y/n) ");
             answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")){
                guessTheNumber();
            }
            if (answer.equalsIgnoreCase("N")){
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        guessTheNumber();
        playAgain();
    }
}
