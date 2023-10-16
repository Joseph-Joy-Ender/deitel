package programizPro;

import java.util.Scanner;

public class PercentageMarksOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[8];

        double sum = 0;
        double percentageMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks " + (i + 1));
            marks[i] = scanner.nextDouble();
            sum += marks[i];

        }
        percentageMarks = sum / marks.length;
        System.out.println(percentageMarks);

    }
}
