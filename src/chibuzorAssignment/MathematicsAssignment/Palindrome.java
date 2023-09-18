package chibuzorAssignment.MathematicsAssignment;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String number){
        String backward = "";
        int numberOfLength = 0;

        numberOfLength = numberOfLength + number.length();
        for (int i = numberOfLength - 1; i >= 0; i--) {
            backward = backward + number.charAt(i);
        }
        return number.equals(backward);
    }

}
