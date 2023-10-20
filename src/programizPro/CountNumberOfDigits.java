package programizPro;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= number ; i++) {
             sum = number % 10;
            count += 1;
           number /= 10;
        }
        System.out.println(sum);
        System.out.println(number);

    }
}
