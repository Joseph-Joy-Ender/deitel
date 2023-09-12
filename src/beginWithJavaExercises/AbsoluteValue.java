package beginWithJavaExercises;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

       number = (number < 0) ? -number : number;
        System.out.println("The absolute value is " + number);

        number = Math.abs(number);
        System.out.println("The absolute value is " + number);

    }
}
