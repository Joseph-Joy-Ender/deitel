package chapter4;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        int number = scanner.nextInt();

        int firstLargestNumber = number;
        int secondLargestNumber = number;

        for (int count = 1; count <= 10 ; count++) {
            System.out.println("Enter ten integers: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber > firstLargestNumber){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = secondNumber;
            }


        }
        System.out.println("First largest number is: " + firstLargestNumber);
        System.out.println("Second largest number is: " + secondLargestNumber);
    }
}
