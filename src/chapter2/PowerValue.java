package chapter2;

import java.util.Scanner;

public class PowerValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        //   public static int calculatePower(int firstNumber, int secondNumber){
        int outputNumber = 1;
        for (int i = 0; i < firstNumber; i++) {
        outputNumber =  outputNumber *= secondNumber;

           // return outputNumber;

        }
      //  return outputNumber;


    }
    }
//}