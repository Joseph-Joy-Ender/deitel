package task;

import java.util.Scanner;

public class StudentScoreTest {
    public static void main(String[] args) {
        Scanner studentInput1 = new Scanner(System.in);
        Scanner studentInput2 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = studentInput1.nextLine();

        System.out.print("Enter your average score: ");
        double average = studentInput1.nextDouble();

        System.out.println();

        System.out.print("Enter your name: ");
        String name1  = studentInput2.nextLine();
        //studentInput.next();
        System.out.print("Enter your average score: ");
        double average1 = studentInput2.nextDouble();

        StudentScore student1 = new StudentScore(name, average );
        StudentScore student2 = new StudentScore(name1, average1);


        System.out.println("Name of student is: " + student1.getName());
        System.out.println("Average of student is:  " + student1.getLetterGrade());
        System.out.println();

        System.out.println("Name of student is: " + student2.getName());
        System.out.println("Average of student is: " + student2.getLetterGrade());
    }
}
