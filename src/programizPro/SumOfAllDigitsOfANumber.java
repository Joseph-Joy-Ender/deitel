package programizPro;

import java.util.Scanner;

public class SumOfAllDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int num = number;
        int sum = 0;
        int digit;
        while (num != 0){
           digit =  num % 10;
           sum += digit;

           num /= 10;

        }

        System.out.println(sum);
    }
}
