package programizPro;

import java.util.Scanner;

public class AddingNumbersUntilUserEnters0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter numbers or 0 to end: ");
            int number = scanner.nextInt();

            if (number == 0) {
                return;
            } else {
                sum += number;
            }

            System.out.println("Sum is: " + sum);
        }
    }
}
