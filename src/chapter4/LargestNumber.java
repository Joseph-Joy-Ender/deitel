package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean con = true;
        while (con) {
            System.out.println("Enter numbers or enter -0 to terminate: ");
            int number = userInput.nextInt();
            if (number == -0) con = false;


        }
    }
}
