package beginWithJavaExercises;

import java.util.Scanner;

public class SmallestAndLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char choice;

        do {
            System.out.println("Enter a number: ");
             number = scanner.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }

            System.out.println("Do you wish to continue y/n? ");
            choice = scanner.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);


    }
}
