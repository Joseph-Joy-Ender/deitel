package chibuzo_task;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter ten scores: ");
            int scores = scanner.nextInt();
            sum += scores;
            average = (double) sum / i;
        }
        System.out.println("Average of the ten scores is: " + average);

    }
}
