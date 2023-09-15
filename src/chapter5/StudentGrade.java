package chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int count = 1; count <= 5; count++) {
            System.out.println("Enter your grade: ");
            String grade = scanner.nextLine();

            switch (grade) {
                case "1" -> aCounter++;
                case "2" -> bCounter++;
                case "3" -> cCounter++;
                case "4" -> dCounter++;

            }

        }
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d",
                    "Result of student grade:",
                    "A: ", aCounter,
                    "B: ", bCounter,
                    "C: ", cCounter,
                    "D: ", dCounter

            );
        }
    }
