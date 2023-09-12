package chapter4;

import java.util.Scanner;

public class CounterControlled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int grade = 1;
        while (grade <= 10) {
            System.out.print("Enter next grade: ");
            int grades = scanner.nextInt();
            total = total + grades;
            grade = grade + 1;
        }
            int average = total / 10;

            System.out.printf("%nTotal of all 10 grades is %d%n ", total);
            System.out.printf("Class average is %d%n ", average);

    }
}
