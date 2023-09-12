package chapter2;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        //int squared =  number * number;
        int squared = (int)Math.pow(number, 2);

        System.out.println("The square of " + number +" is " + squared);

        //System.out.println("the square of " + number + " is "  +   userInput);
    }
}
