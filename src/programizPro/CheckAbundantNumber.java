package programizPro;

import java.util.Scanner;

public class CheckAbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (i / number == 0){
                sum += i;

            }
        }

        if (sum > number){
            System.out.println("Abundant number");
        }else {
            System.out.println("Not an abundant number");
        }
    }
}
