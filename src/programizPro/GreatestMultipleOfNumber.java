package programizPro;

import java.util.Scanner;

public class GreatestMultipleOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100: ");
        int number = scanner.nextInt();

        for (int i = 100; i > 1 ; i--) {
            if (i % number == 0){
                System.out.println(number);
                break;
            }
        }
       // System.out.println(number);
        scanner.close();
    }
}
