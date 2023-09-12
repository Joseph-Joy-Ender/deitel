package randomExercises;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount :");
        double Principal = input.nextDouble();

        System.out.println("Enter the time in year: ");
        double Time = input.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double Rate = input.nextDouble();

       double SimpleInterest = (Principal * Time * Rate) / 100;
       double FinalAmount = Principal + SimpleInterest;

       System.out.println("The simple interest is " + SimpleInterest);
        System.out.println("The final amount is " + FinalAmount);
    }
}
