package arraysSnacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeExample {

    static int student;
    static int subject;

    static int[][] lagbaja = new int[student][subject];

    public static void question(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have? ");
        student = scanner.nextInt();

        System.out.println("How many subject do they offer? ");
        subject = scanner.nextInt();
         lagbaja = new int[student][subject];
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        System.out.println();
        question2();
    }

    public static void question2(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lagbaja.length;i++){
            for (int j = 0; j < lagbaja[i].length; j++) {
                System.out.println(" Enter score for student " + (i + 1) + "\n " + "Enter score for subject " + (j + 1));
                lagbaja[i][j] = scanner.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>> ");
                System.out.println("Saved successfully");
                System.out.println();
            }

        }
    }

    public static void displayingHeader(){
        String students = null;
//        for (int j = 0; j < student; j++) {
//            students = "Student " + (j + 1) + "     ";
//
//        }
//        System.out.println(students);
        String header = "STUDENT      ";
        for (int i = 0; i < subject; i++) {
            String subjects = "SUB" + (i + 1) + "      ";
            students = "Student " + (i + 1) + "     ";
            header = header.concat(subjects);

        }


        System.out.println(header + "Tot      " + "Ave      " + "Pos");
        System.out.println(students);
    }




    public static void displayingStudent(){
        for (int[] ints : lagbaja) {
            for (int anInt : ints) {
                System.out.printf("%13d", anInt);

            }
            System.out.println();
        }
    }

//    static ArrayList<Double> posit = new ArrayList<>();
//    public static int[] position(int average){
//        int counter = 0;
//        int[] posit = new int[average];
//        Arrays.fill(posit, 1);
//
//        for (int i = 0; i < posit.length; i++) {
//            for (int j = 0; j < posit[i] ; j++) {
//                if (i < j){
//                    posit[counter] = counter+= 1;
//                }
//
//            }
//
//        }
//
//        return posit;
//    }
public static double position(double average){
    int counter = 0;
    double[] posit = new double[(int) average];
    Arrays.fill(posit, 1);

    for (int i = 0; i < posit.length; i++) {
        for (int j = 0; j < posit[i]; j++) {
            if (i < j){
                posit[counter] = counter += 1;
            }

        }

    }

    //  return studentsAverageScoreTemp.add(posit);
    return posit[counter];
}

//    static double[] studentsAverageScoreTemp = new double[student];
//    public static int getPosition(double averageScore, int average) {
//        int i = 0;
//        for (double ave: studentsAverageScoreTemp) {
//            if(averageScore == ave) {
//                break;
//            }
//            i++;
//        }
//        return i;
//    }
    public static void main(String[] args) {
        question();
        displayingHeader();
        displayingStudent();
    }
}
