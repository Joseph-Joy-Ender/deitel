package randomExercises;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the selling price and cost price :");
        int sellingPrice = input.nextInt();
        int costPrice = input.nextInt();

        int result = sellingPrice - costPrice;

        if (sellingPrice > costPrice) {
            System.out.println("The profit is " + result);
        } else {
            System.out.println("The loss is " + result);
        }
    }
}