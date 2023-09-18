package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class Factorials {

    public static int factorial(int number){
        int total = 1;

        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        return total;
    }


}
