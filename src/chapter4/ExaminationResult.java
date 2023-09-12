package chapter4;

import java.util.Scanner;

public class ExaminationResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int failure = 0;
        int counter = 1;

        while (counter <= 10){
            System.out.println("Enter examination result (1 = pass, 2 = fail): ");
            int examResult = scanner.nextInt();

            if (examResult == 1) passes += 1;
            else {
                failure += 1;
            }
            counter+= 1;
        }
        System.out.printf("Passes: %d%nFailed: %d%n ", passes, failure);

        if (passes > 8) System.out.println("Bonus to instructor!");


    }
}
