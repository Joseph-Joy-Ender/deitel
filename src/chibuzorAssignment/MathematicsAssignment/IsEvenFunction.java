package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class IsEvenFunction {


    public static boolean isEven(int number){
        return number % 2 == 0;

    }
    public static int input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
