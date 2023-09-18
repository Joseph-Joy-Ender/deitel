package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class Factors {

    public static int factors(int number){
        int total = 0;
        for (int count = 1; count <= number ; count++) {
            if (number % count == 0)total++;
        }
        return total++;
    }


}
