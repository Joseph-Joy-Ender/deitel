package programizPro;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        int num = number;
        while (num != 0) {

            int digit = num % 10;
            sum += digit;

            num /= 10;

        }
        System.out.println(sum);
            if (number % sum == 0){
                System.out.println("Harshad number");
            }else {
                System.out.println("Not an harshad number");
            }
            scanner.close();





    }
}
