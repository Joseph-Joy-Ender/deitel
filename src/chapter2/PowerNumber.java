package chapter2;

import java.util.Scanner;

public class PowerNumber {

    public static int calculatePower(int firstNumber, int secondNumber) {
        int outputNumber = 1;

        for (int i = 0; i < secondNumber; i++) {
            outputNumber *= firstNumber;
        }

        return outputNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;


        System.out.println("Enter firstNumber: ");
        firstNumber = input.nextInt();

        System.out.println("Enter secondNumber: ");
        secondNumber = input.nextInt();

        int power = calculatePower(firstNumber, secondNumber);

        System.out.println(firstNumber + " raised to the power of " + secondNumber + " is: " + power);
    }

}



