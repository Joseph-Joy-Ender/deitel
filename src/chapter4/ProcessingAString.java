package chapter4;

import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        String length = String.valueOf(string.length());
        String firstCharacter = String.valueOf(string.charAt(0));

        System.out.println("The length is: " + length);
        System.out.println("The first character is: " + firstCharacter);
    }
}
