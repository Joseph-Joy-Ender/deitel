package chapter2;
import java.util.Scanner;
public class Squares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int userInput = number * number;
        System.out.println("The square of " +  number + " is " + " " + userInput);
    }
}
