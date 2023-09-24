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
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your grade: ");
                String grade = scanner.nextLine();

                switch (grade) {
                    case "A" -> aCounter++;
                    case "B" -> bCounter++;
                    case "C" -> cCounter++;
                    case "D" -> dCounter++;

                }

                System.out.println("Name of student is " + name + " \n" + "Grade is " + grade);
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

