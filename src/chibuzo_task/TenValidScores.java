package chibuzo_task;

import java.util.Scanner;

public class TenValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter scores: ");
            int scores = scanner.nextInt();

            if (scores > 0 && scores <= 100){
                sum += scores;
            }else {
                System.out.println("Enter a valid score: ");
                i--;
            }
        }
        System.out.println("The sum of numbers is " + sum);


    }
}
