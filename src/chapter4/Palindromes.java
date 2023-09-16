package chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit integer: ");
        int number = scanner.nextInt();

        while (number != 5){
            System.out.println("Error");
            System.out.println("Enter a five digit integer: ");
            number = scanner.nextInt();

            if (number == 5){

            }
        }


    }
}
