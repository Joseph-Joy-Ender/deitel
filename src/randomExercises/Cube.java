package randomExercises;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of a cube :");
        int length = input.nextInt();

      int cube = length * length * length;

      System.out.println("The volume of cube is " + cube);

    }
}
