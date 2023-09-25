package programizPro;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= number ; i++) {
            int sum = number % 10;
            count += 1;
            System.out.println(sum);
        }
        System.out.println(count);

    }
}
