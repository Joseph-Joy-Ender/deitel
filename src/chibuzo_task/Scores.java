package chibuzo_task;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter ten scores: ");
            int scores = scanner.nextInt();

            sum += scores;
        }
        System.out.println("The sum of the ten scores is: " + sum);
    }

}
