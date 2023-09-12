package randomExercises;

import java.util.Scanner;

public class Welcome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
       // System.out.println( name + " You're Welcome\nto\nSemicolon\nVillage\nand\nCommunity");
        System.out.println("Hello " + name);
    }
}
