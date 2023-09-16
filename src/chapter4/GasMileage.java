package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        int miles = userInput.nextInt();
        System.out.println("Enter gallons used for each tankful: ");
        int gallons = userInput.nextInt();

        double totalMilesPerGallon = 0;

        double milesPerGallon = (double) miles / gallons;
        System.out.printf("%.5f%n", milesPerGallon);

        totalMilesPerGallon += milesPerGallon;


        boolean condition = true;
        System.out.println("Do you wish to continue ?");
        String answer = userInput.next();
        userInput.nextLine();

        if (answer.equals("no")) condition = false;


        while (condition) {

            System.out.println("Enter miles driven: ");
            miles = userInput.nextInt();

            System.out.println("Enter gallons used for each tankful: ");
            gallons = userInput.nextInt();

            milesPerGallon = (double) miles / gallons;
            System.out.println(milesPerGallon);

            totalMilesPerGallon += milesPerGallon;

            System.out.println("Do you wish to continue: ");
             answer = userInput.next();
             userInput.nextLine();
            if (answer.equals("no")) condition = false;


        }

        System.out.printf("Total miles per gallon is %.4f " , totalMilesPerGallon);
    }
}
