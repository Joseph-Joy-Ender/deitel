package chapter4;

import java.util.Scanner;

public class ConvertingLetterGradeToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = scanner.nextLine();

        switch (grade){
            case "A" -> System.out.println("The numeric value for grade " + grade + " is 4" );
            case "B" -> System.out.println("The numeric value for grade " + grade + " is 3");
            case "C" -> System.out.println("The numeric value for grade " + grade + " is 2");
            case "D" -> System.out.println("The numeric value for grade " + grade + " is 1");
            case "F" -> System.out.println("The numeric value for grade " + grade + " is 0");
            default -> System.out.println(grade + " is an invalid grade");
        }
    }
}
