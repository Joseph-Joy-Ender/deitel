package chibuzo_task;

import java.util.Arrays;
import java.util.Scanner;

public class LargestScoreInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] scores = new int[10];

        int largestScore = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores: ");
            int score = scanner.nextInt();

            if (score > largestScore) largestScore = score;
            scores[i] = score;
        }

        System.out.println(Arrays.toString(scores));
        System.out.println("The largest scores is " + largestScore);
    }
}
