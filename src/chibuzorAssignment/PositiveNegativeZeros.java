package chibuzorAssignment;

import java.util.Scanner;

public class PositiveNegativeZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter number or enter -99 to terminate: ");

        int number = scanner.nextInt();

        while (number  != -99){
            if (number > 0)positiveCount++;
            else if (number < 0)negativeCount++;
            else zeroCount++;
            System.out.println("Enter number or enter -99 to terminate   : ");

            number = scanner.nextInt();

            }
        System.out.println("Positive number is " + positiveCount);
        System.out.println("Negative number is " + negativeCount);
        System.out.println("Zero number is " + zeroCount);
        }


    }
