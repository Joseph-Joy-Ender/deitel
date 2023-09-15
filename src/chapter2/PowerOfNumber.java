package chapter2;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int number1;
//        int number2;
//        int outputNumber = 1;
//
//        for (int i = 0; i < number2; i++) {
//            outputNumber *= number1;
//        }
        int number1;
        int number2;
        System.out.println("Enter first number: ");
         number1 = input.nextInt();
        System.out.println("Enter second number: ");
         number2 = input.nextInt();

        int outputNumber = 1;

        for (int i = 0; i < number2; i++) {
           outputNumber *= number1;
        }


        System.out.println(number2 + " raised to the power of " + number1  +" is " + number2);



    }
}
