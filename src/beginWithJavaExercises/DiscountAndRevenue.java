package beginWithJavaExercises;

import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product price: ");
        int productPrice = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        int revenue = productPrice * quantity;

        double discount;
        if (revenue > 5000) {
            discount = 0.10 * productPrice;
            System.out.println("The net revenue is " + revenue);
            System.out.println("The discount is " + discount);
        }
    }

}