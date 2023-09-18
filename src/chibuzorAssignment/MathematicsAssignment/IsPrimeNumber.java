package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class IsPrimeNumber {


    public static boolean isPrimeNumber(int number){
        if(number == 1) {
            return false;
        }
        int flag = 0;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag != 1;
    }

    public static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

}
