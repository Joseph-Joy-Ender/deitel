package chapter2;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        System.out.println("Guess a number between 0 and 100 : ");
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter your guess : ");
        int guess = input.nextInt();

        if(guess == number)
            System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");

        guess = -1;
            while(guess != number){
                System.out.println("\nEnter your guess");
                guess = input.nextInt();
                if(guess == number)
                    System.out.println("Yes, the number is " + number);
                else if (guess > number)
                    System.out.println("Your guess is too high");
                else
                    System.out.println("Your guess is too low");

            }
    }
}
