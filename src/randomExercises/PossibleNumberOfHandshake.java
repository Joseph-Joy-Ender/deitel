package randomExercises;

import java.util.Scanner;

public class PossibleNumberOfHandshake {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of student : ");
        int number = input.nextInt();

        int combination = (number * (number - 1)) / 2;

        System.out.println("The number of possible handshake is " + combination);
    }
}
