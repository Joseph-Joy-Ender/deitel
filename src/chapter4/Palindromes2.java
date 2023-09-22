package chapter4;

import java.util.Scanner;

public class Palindromes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a five digit number: ");
       int number = 0;

        while (number != 5){

            System.out.println("Enter a five digits number: ");
            number = scanner.nextInt();

            int firstNumber = number / 10000 % 10;
            int secondNumber = number / 1000 % 10;
            int thirdNumber = number / 100 % 10;
            int fourthNumber = number / 10 % 10;
            int fifthNumber  = number % 10;

            if (firstNumber == fifthNumber){
                System.out.println("This a palindrome");
            }
            else System.out.println("Number is not a palindrome");
        }
    }
}
