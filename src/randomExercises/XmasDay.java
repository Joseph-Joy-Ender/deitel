package randomExercises;

import java.util.Scanner;

public class XmasDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number from 1 to 10 : ");
        int day = scanner.nextInt();


        String[] number = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        System.out.println(number[day - 1]);

    }
}
