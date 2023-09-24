package chapter4;

import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter major: ");
        String major = scanner.next();
        System.out.print("Enter a number character: ");
        int number = scanner.nextInt();

        for (int i = number; i <= number ; i++) {

            switch (major) {
                case "M" -> input("Mathematics");
                case "C" -> input("Computer Science");
                case "I" -> input("Information Technology");
            }

            switch (number) {
                case 1 -> input("Freshman");
                case 2 -> input("Sophomore");
                case 3 -> input("Junior");
                case 4 -> input("Senior");
            }
        }
    }

    private static void input(String display){
        System.out.println(display);
    }
}
