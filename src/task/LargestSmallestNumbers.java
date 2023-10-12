package task;

import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = input.nextInt();

        int largest = 0;
        int smallest = 0;
       int total = 0;
        for (int count = 0; count <= number; count++) {
            if (number > largest) largest = number;
            total = total + 1;
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);

        }
    }

