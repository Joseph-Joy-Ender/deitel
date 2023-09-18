package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class Subtraction {


    public static int subtract(int number1, int number2){
         return myAbs(number1 - number2);
    }


    public static int myAbs(int value){
        if (value < 0) return -(value);
        return value;
    }
}
