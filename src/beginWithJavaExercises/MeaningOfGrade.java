package beginWithJavaExercises;

import java.util.Scanner;

public class MeaningOfGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Good");
            case "C" -> System.out.println("Average");
            case "D" -> System.out.println("Deficient");
            case "F" -> System.out.println("Failing");
        }

    }
    }

