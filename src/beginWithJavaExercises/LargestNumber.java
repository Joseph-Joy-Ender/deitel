package beginWithJavaExercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) System.out.println(number1 + " is the largest number");
        else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the largest number");
        }else {
            System.out.println(number3 + " is the largest number");

        }
    }
}
