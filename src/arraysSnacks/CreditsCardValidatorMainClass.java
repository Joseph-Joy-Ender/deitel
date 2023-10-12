package arraysSnacks;

import java.util.Scanner;

public class CreditsCardValidatorMainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, kindly enter details to verify: ");
        long creditCardNumber = scanner.nextLong();


        System.out.println("************************************************");
        System.out.println("**Credit Card Type: " + CreditsCardValidators.creditCardType(creditCardNumber));
        System.out.println("**Credit card Number: " + creditCardNumber);
        System.out.println("**Credit Card Digit Length: " + CreditsCardValidators.lengthOfCreditCardNumber(creditCardNumber));
        System.out.println("**Credit Card Validity Status: " + CreditsCardValidators.additionOfEvenlyPlacedAndOddlyPlaced(creditCardNumber));
        System.out.println("***********************************************");
    }
}
