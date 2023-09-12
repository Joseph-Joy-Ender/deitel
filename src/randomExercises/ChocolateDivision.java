package randomExercises;

import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of chocolate: ");
        int chocolate = input.nextInt();

        System.out.println("Enter number of children available :");
        int children = input.nextInt();

        int result = chocolate / children;
        int choc = chocolate % children;

        System.out.println("Number of chocolate for each child is " + result);
        System.out.println("Number of remaining chocolate is " + choc);
    }
}
