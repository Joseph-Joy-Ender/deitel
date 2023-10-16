package arraysSnacks;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student;
        int subject;

        System.out.println("How many students do you have? ");
        student = scanner.nextInt();

        System.out.println("How many subject do they offer? ");
        subject = scanner.nextInt();
        int[][] lagbaja = new int[student][subject];
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        System.out.println();
        // StudentGrade.gradeCollection(lagbaja);

        for (int i = 0; i < lagbaja.length;
        i++){
            for (int j = 0; j < lagbaja[i].length; j++) {
                System.out.println(" Enter score for student " + (i + 1) + "\n " + "Enter score for subject " + (j + 1));
                lagbaja[i][j] = scanner.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>> ");
                System.out.println("Saved successfully");
                System.out.println();
            }

        }
        System.out.println("Student         SUB1         SUB2      SUB3");
            for (int[] ints : lagbaja) {
                for (int anInt : ints) {
                    System.out.printf("%13d", anInt);

                }
                System.out.println();
            }



    }
}
