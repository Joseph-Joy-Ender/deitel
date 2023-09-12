package beginWithJavaExercises;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 50;
        System.out.println("Number is " + number);

        number++;
        System.out.println("Now number is " + number);

        number--;
        System.out.println("Now number is " + number);

        int value; // to hold number
        int sum = 0; // initialize sum that will add numbers together

        System.out.println("Enter number or enter 0 to quit: "); // prompt user for number
        value = scanner.nextInt(); // store number in value

        while (value != 0){ // when user doesn't input 0, the loop keep asking for numbers until user input 0
            sum = sum + value; // numbers are added

            System.out.println("Enter number or enter 0 to quit: "); // prompt usr again for numbers inside the loop
            value = scanner.nextInt(); // assign number to variable
        }
        System.out.println("Sum of integer is: " + sum); // print out the sum
    }
}
