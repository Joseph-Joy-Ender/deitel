package chapter4;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();

        switch (letter){
            case "A",
                    "B",
                    "C",
                    "a",
                    "b",
                    "c" -> System.out.println("The corresponding number is 2");
            case "D",
                    "d",
                    "E",
                    "e",
                    "F",
                    "f" -> System.out.println("The corresponding number is 3");
            case "G",
                    "g",
                    "H",
                    "h",
                    "I",
                    "i" -> System.out.println("The corresponding number is 4");
            case "J",
                    "j",
                    "K",
                    "k",
                    "L",
                    "l" -> System.out.println("The corresponding number is 5");
            case "M",
                    "m",
                    "N",
                    "n",
                    "O",
                    "o" -> System.out.println("The corresponding number is 6");
            case "P",
                    "p",
                    "Q",
                    "q",
                    "R",
                    "S",
                    "s" -> System.out.println("The corresponding number is 7");
            case "T",
                    "t",
                    "U",
                    "u",
                    "V",
                    "v" -> System.out.println("The corresponding number is 8");
            case "W",
                    "w",
                    "X",
                    "x",
                    "Y",
                    "y",
                    "Z",
                    "z" -> System.out.println("The corresponding number is 9");
            default -> System.out.println(letter + " is an invalid input");


        }
    }
}
