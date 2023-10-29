package arraysSnacks;

import java.util.Arrays;
import java.util.Scanner;


public class StudentGrade {
    public static void main(String[] args) {

        displayQuestion1();
        subjectSummary();
        largestInRows();

    }

    static int students;
    static int subjects;
    static int[][] lagbaja = new int[students][subjects];

    static double[] studentsAverageScoreTemp = new double[students];


    public static void displayQuestion2(){
        int[] studentsTotalScore = new int[students];
        double[] studentsAverageScore = new double[students];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lagbaja.length;i++){
            int totalScore = 0;
            for (int j = 0; j < lagbaja[i].length; j++) {
                System.out.println(" Enter score for student " + (i + 1) + "\n " + "Enter score for subject " + (j + 1));
                int score = scanner.nextInt();
                lagbaja[i][j] = score;
                totalScore += score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>> ");
                System.out.println("Saved successfully");
                System.out.println();

            }
            studentsTotalScore[i] = totalScore;
            studentsAverageScore[i] = (double) totalScore / subjects;

        }
        studentsAverageScoreTemp = Arrays.copyOf(studentsAverageScore, students);
        Arrays.sort(studentsAverageScoreTemp);

        System.out.println(printHeader(subjects));
        for(int i = 0; i < lagbaja.length; i++) {
            System.out.print("Student " + (i + 1) + "      ");
            for(int j = 0; j < lagbaja[i].length; j++) {
                System.out.print(lagbaja[i][j] + "       ");
            }
            System.out.print(studentsTotalScore[i]  + "       ");
          //  System.out.print(studentsAverageScore[i]  + "       ");
            System.out.format("%.2f", studentsAverageScore[i]   );
            System.out.print(students - position(studentsAverageScore[i]) + "  ");
            System.out.println();
        }
        System.out.println("========================================================================");

    }
    public static void displayQuestion1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have? ");
        students = scanner.nextInt();

        System.out.println("How many subject do they offer? ");
        subjects = scanner.nextInt();
        lagbaja = new int[students][subjects];
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        System.out.println();
        displayQuestion2();
    }


    public static String printHeader(int noOfSubjects){
        System.out.println("========================================================");
        String header = "STUDENT      ";
        for (int i = 0; i < noOfSubjects; i++) {
            String subjects = "SUB" + (i + 1) + "      ";
            header = header.concat(subjects);

        }
        return header + "Tot      " + " Ave     " +     "Pos";
    }


    public static int position(double averageScore){
        int i = 0;
        for (double ave: studentsAverageScoreTemp) {
            if(averageScore == ave) {
                break;
            }
            i++;
        }
        return i;
    }


    public static void subjectSummary(){
        for (int i = 0; i < subjects; i++) {
            String subjects = "Subject  " + (i + 1) + "   ";
            System.out.println(subjects);

        }
    }


    public static void largestInRows(){
        int largest = Integer.MIN_VALUE;





    }

}
