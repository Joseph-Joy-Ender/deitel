package chapter1;

import java.util.Scanner;

public class BitFlipper {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 0 or 1");

        int number1 = userInput.nextInt();

        if (number1 == 0) {
            System.out.println(1);
        }
            if(number1 == 1) {
                System.out.println(0);
            }


    }
}
