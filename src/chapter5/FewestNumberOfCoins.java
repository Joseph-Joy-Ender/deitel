package chapter5;
import java.util.Scanner;
public class FewestNumberOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchase price: ");
        double purchasePrice = scanner.nextDouble();
        System.out.println("Enter amount tender: ");
        double amountTendered = scanner.nextDouble();

        double cents = amountTendered - purchasePrice;

        int quarters = 25;
        int dimes = 10;
        int pennies = 1;
        int qCounter = 0, pCounter = 0, dCounter = 0;

        //73 - (25+10+1) = 73 - 36 = 37
        //37 - (25+10+1) = 37 - 36 = 1
        while (cents > 0) {
            if (cents > (quarters + dimes + pennies)) {
                cents = cents - (quarters + dimes + pennies);
                qCounter++;
                pCounter++;
                dCounter++;
            } else if (cents > (dimes + pennies)) {
                cents = cents - (dimes + pennies);
                pCounter++;
                dCounter++;
            } else if (cents >= pennies) {
                cents = cents - pennies;
                pCounter++;
            } else {
                break;
            }
        }

        System.out.println("Your change is: \n" + qCounter + " quarters \n" + dCounter + " dimes \n" + pCounter + " pennies");

    }
}
