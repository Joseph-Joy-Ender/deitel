package chibuzo_task;

import java.util.Scanner;

public class SumOfEvenNumbersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sumOfEven = 0;
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Enter 10 scores: ");
            int scores = scanner.nextInt();
            if (scores % 2 == 0){
                sumOfEven += scores;
                average = (double) sumOfEven / i;
            }
        }
       // System.out.println("The average is " + average);
        System.out.println("The sum of the score is " + sumOfEven);
    }
}
