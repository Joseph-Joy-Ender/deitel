package arraysSnacks;

import java.util.Arrays;
import java.util.Scanner;


public class StudentGrade {
    public static void main(String[] args) {

        displayQuestion1();
        subjectSummary();


    }

    static int noOfStudents;
    static int noOfSubjects;
    static int[][] studentGrade = new int[noOfStudents][noOfSubjects];

    static double[] studentsAverageScoreTemp = new double[noOfStudents];

    static int[] subjectsScores;
//    = new int[studentGrade[0].length];

    static int totalSubjectScore = 0;


    public static void displayQuestion2(){
        int[] studentsTotalScore = new int[noOfStudents];
        double[] studentsAverageScore = new double[noOfStudents];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < studentGrade.length; i++){
            int totalScore = 0;
            for (int j = 0; j < studentGrade[i].length; j++) {
                System.out.println(" Enter score for student " + (i + 1) + "\n " + "Enter score for subject " + (j + 1));
                int score = scanner.nextInt();
                studentGrade[i][j] = score;
                totalScore += score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>> ");
                System.out.println("Saved successfully");
                System.out.println();

            }
            studentsTotalScore[i] = totalScore;
            studentsAverageScore[i] = (double) totalScore / noOfSubjects;

        }
        studentsAverageScoreTemp = Arrays.copyOf(studentsAverageScore, noOfStudents);
        Arrays.sort(studentsAverageScoreTemp);

        System.out.println(printHeader(noOfSubjects));
        for(int i = 0; i < studentGrade.length; i++) {
            System.out.print("Student " + (i + 1) + "      ");
            for(int j = 0; j < studentGrade[i].length; j++) {
                System.out.print(studentGrade[i][j] + "       ");
            }
            System.out.print(studentsTotalScore[i]  + "       ");
            System.out.format("%.2f", studentsAverageScore[i]);
            System.out.print("    " + (noOfStudents - position(studentsAverageScore[i])) + "  ");
            System.out.println();
        }
        System.out.println(printingLines());

    }
    public static void displayQuestion1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have? ");
        noOfStudents = scanner.nextInt();

        System.out.println("How many subject do they offer? ");
        noOfSubjects = scanner.nextInt();
        studentGrade = new int[noOfStudents][noOfSubjects];
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        System.out.println();
        displayQuestion2();
    }


    public static String printHeader(int noOfSubjects){
        System.out.println(printingLines());
        String header = "STUDENT      ";
        for (int i = 0; i < noOfSubjects; i++) {
            String subjects = "SUB" + (i + 1) + "      ";
            header = header.concat(subjects);

        }
        System.out.println(printingLines());
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

    public static int highestScore(int[]array){

        int highest = array[0];
        for (int i : array) {
            if (highest < i) highest = i;

        }
        return highest;

    }

    public static int lowestScore(int[] array) {
        int lowest = array[0];
        for (int i : array) {
            if (lowest > i) lowest = i;

        }
        return lowest;
    }


    public static int getStudentIndex(int score, int[] subjectScores) {
        int index = 0;
        for (int ind:subjectScores) {
            if (score == ind) break;
            index ++;

        }
        return index;
    }
    public static String printingLines(){
        return "=".repeat(70);
    }

    public static void subjectSummary(){
        System.out.println("SUBJECT SUMMARY");
        int count = 0;
        int fail = 0;
        int pass = 0;
        for (int i = 0; i < studentGrade[0].length; i++) {
            System.out.println("Subject " + (i + 1));
            subjectsScores = new int[studentGrade[0].length];
            for (int j = 0; j < studentGrade[0].length; j++) {
                if (count < studentGrade[0].length){
                    subjectsScores[j] = studentGrade[j][count];
                    totalSubjectScore += studentGrade[j][count];
                    if (studentGrade[j][count] < 50) fail++;
                    else pass++;
                }
            }
            subjectSummary2(pass, fail);
            count++;
        }
    }

    public static void subjectSummary2(int pass, int fail) {
        System.out.print("highest scoring student is student " + (getStudentIndex(highestScore(subjectsScores), subjectsScores) + 1));

        System.out.println(" scoring " + highestScore(subjectsScores));


        System.out.print("lowest scoring student is student " + (getStudentIndex(lowestScore(subjectsScores), subjectsScores) + 1));

        System.out.println(" scoring " + lowestScore(subjectsScores));

        System.out.println("Total score is " + totalSubjectScore);
        System.out.println("Average score is: " + (totalSubjectScore / studentGrade.length));
        System.out.println("Number of passes: " + pass);
        System.out.println("Number of fails: " + fail);
        System.out.println();
    }
}
