package beginWithJavaExercises;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first subject grade: ");
        int subject1 = scanner.nextInt();

                if (subject1 >= 90 && subject1 <= 100) {
                    System.out.println("A");
                } else if (subject1 >= 80 && subject1 <= 89) {
                    System.out.println("B");
                } else if (subject1 >= 70 && subject1 <= 79) {
                    System.out.println("C");
                } else if (subject1 >= 60 && subject1 <= 69) {
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }

        System.out.print("Enter second subject grade: ");
                int subject2 = scanner.nextInt();
                if (subject2 >= 90 && subject2 <= 100){
                    System.out.println("A");
                } else if (subject2 >= 80 && subject2 <= 89) {
                    System.out.println("B");
                } else if (subject2 >= 70 && subject2 <= 79) {
                    System.out.println("C");
                } else if (subject2 >= 60 && subject2 <= 69) {
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }

        System.out.print("Enter third subject grade: ");
                int subject3 = scanner.nextInt();
        if (subject3 >= 90 && subject3 <= 100){
            System.out.println("A");
        } else if (subject3 >= 80 && subject3 <= 89) {
            System.out.println("B");
        } else if (subject3 >= 70 && subject3 <= 79) {
            System.out.println("C");
        } else if (subject3 >= 60 && subject3 <= 69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

            }
        }

