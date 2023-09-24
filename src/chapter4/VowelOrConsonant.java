package chapter4;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = scanner.nextLine();

        switch (letter){
            case "A", "a", "E", "e", "I", "i", "O", "o","u", "U" -> System.out.println(letter + " is a vowel");
            default -> System.out.println(letter + " is a consonant");
        }
    }
}
