package arraysSnacks;

import java.lang.reflect.Array;
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
        System.out.println();
        String header = "STUDENT      ";
        for (int i = 0; i < subject; i++) {
            String subjects = "SUB" + (i + 1) + "      ";
            header = header.concat(subjects);
        }
        System.out.println(header + "Tot      " + "Ave      " + "Pos");
//        System.out.print("STUDENT   ");
//        for (int i = 0; i < subject; i++) {
//            System.out.printf("%2s", "SUB" + (i + 1) + "\t");
//        }
//        System.out.println("Tot     " +  "Ave     " +  "Pos    ");
//            System.out.printf("%6s%d", "SUB", (i + 1));
//        }
//        System.out.printf("%7s", "TOT");
//        System.out.printf("%9s", "AVG");
//        System.out.printf("%8s", "POS");
//        System.out.println();
//        equals();
//        System.out.println();

//        String header = "Subject      ";
//        for (int i = 0; i < subject; i++) {
//            String subjects = "SUB" + (i + 1) + "    ";
//            header = header.concat(subjects);
//        }
////        System.out.println(header +  "Tot     " +  "Ave     " +  "Pos    ");
//        System.out.println(header);
//        System.out.printf("%7s", "TOT");
//        System.out.printf("%9s", "AVG");
//        System.out.printf("%8s", "POS");
//        System.out.println();
//        String string = "=";
//        int count = 15;
//        string.repeat(count);
//        System.out.println();


            for (int[] ints : lagbaja) {
                for (int anInt : ints) {
                    System.out.printf("%13d", anInt);

                }
                System.out.println();
            }
        System.out.println();

    }


}
