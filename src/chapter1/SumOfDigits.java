package chapter1;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int digit = input.nextInt();

        int number1 = digit/1000%10;
       int number2 = digit/100%10;
        int number3 = digit/10%10;
        int number4 = digit%10;

        int result = (number1 + number2 + number3 + number4);

        System.out.println("The sum of digit is  " + result);



    }
}
