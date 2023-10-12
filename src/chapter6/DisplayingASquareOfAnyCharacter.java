package chapter6;

import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row and column: ");
        int numberOfRowAndColumn = scanner.nextInt();
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        displayCharacter(character,numberOfRowAndColumn);
    }

    public static void displayCharacter(char chr, int numberOfRowAndColumn){
        for (int row = 0; row < numberOfRowAndColumn; row++) {
            for (int column = 0; column < numberOfRowAndColumn; column++) {
                System.out.print(chr);

            }
            System.out.println();
        }
    }
}
