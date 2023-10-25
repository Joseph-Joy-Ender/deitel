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


        for (int i = 0; i < lagbaja.length;i++){
            for (int j = 0; j < lagbaja[i].length; j++) {
                System.out.println(" Enter score for student " + (i + 1) + "\n " + "Enter score for subject " + (j + 1));
                lagbaja[i][j] = scanner.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>> ");
                System.out.println("Saved successfully");
                System.out.println();
            }

        }


        System.out.println(printHeader(subject));

        displayScoresAndSubjects(lagbaja);




    }


    public static void displayScoresAndSubjects(int[][] lagbaja){
        int i = 0;
        for (int[] ints : lagbaja) {
            String students = "Student " + (i + 1) + "     ";
            int total = 0;
            double average = 0.0;
            System.out.print(students);
            for (int anInt : ints) {
                total += anInt;
                average = (double) total / lagbaja.length;
                System.out.print(anInt + "        ");
            }
            System.out.print(total + "      ");
            System.out.printf("%.2f", average);
            System.out.println();
            i++;
        }

    }
    public static String printHeader(int noOfSubjects){
        String header = "STUDENT      ";
        for (int i = 0; i < noOfSubjects; i++) {
            String subjects = "SUB" + (i + 1) + "      ";
            header = header.concat(subjects);

        }
        return header + " Tot      " + " Ave     " +     "Pos";

    }


}
