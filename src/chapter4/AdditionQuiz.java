package chapter4;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int number = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + number + " is " + (number1 + number2 + number3 == number));
        System.out.println(number1 + " + " + number2 + " + " + number3 + " is " +(number1 + number2 + number3));
    }
}
