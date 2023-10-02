package programizPro;

import java.util.Arrays;
import java.util.Scanner;

public class MeanHeightsOfPlayers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];

        double sum = 0.0;

        for (double i = 0; i < heights.length; i++) {
            System.out.println("Enter heights of player " + (i + 1));
             heights[(int) i] = scanner.nextDouble();
            sum += heights[(int) i];

        }

        System.out.println(sum);
        double mean = sum / heights.length;

       System.out.println(Arrays.toString(heights));
        System.out.println(mean);
    }
}
