package randomExercises;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter salary :");
        double salary = scanner.nextDouble();
        System.out.println("Please enter year: ");
        int year = scanner.nextInt();

        System.out.println(joyBonus(salary, year));
    }
    public static double joyBonus(double salary, int year){
        if(year > 5){
            return salary * 0.05;
        }
        return 0;
    }
}