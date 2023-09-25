package programizPro;

import java.util.Scanner;

public class GreatestFactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number -1; i++) {
            if (number % i == 0) {

                System.out.println(i);
            }
        }
        scanner.close();
    }
}
