package programizPro;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your pin: ");
        String pin = scanner.nextLine();

        while (pin.length() != 6){
            System.out.println("Invalid Pin");
            System.out.println("Enter your pin: ");
            pin = scanner.nextLine();
        }
        System.out.println("Your pin is: "+ pin);

    }
}
