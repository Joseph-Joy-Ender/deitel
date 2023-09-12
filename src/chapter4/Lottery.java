package chapter4;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two-digit number: ");
        int userInput = scanner.nextInt();

        int lotteryNumber = 12;

       // if (userInput == lotteryNumber) System.out.println("You've won an award of $10,000");

        int lottery = (int)(Math.random() * 100);

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = userInput / 10;
        int guessDigit2 = userInput % 10;

        System.out.println("The lottery number is " + lottery);

        if (userInput == lotteryNumber) System.out.println("Congratulations!!, You just won $10,100");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Congrats, you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("You win $1,000");

        } else System.out.println("Sorry you lost");

    }
}
