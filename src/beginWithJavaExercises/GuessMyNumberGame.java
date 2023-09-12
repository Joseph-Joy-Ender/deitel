package beginWithJavaExercises;

import java.util.Scanner;

public class GuessMyNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int guess;

        number = (int) (Math.random() * 100) + 1;

        do {
            System.out.print("Enter a number between 1 to 100: ");
            guess = scanner.nextInt();

            if (guess == number){
                System.out.println("You guessed the right number");
            }else if (guess < number){
                System.out.println("Your guess is lower than number. \nGuess number again!");
            } else {
                System.out.println("Your guess is higher than number. \nGuess again!");
            }
        }
        while (guess != number);
    }
}
