package programizPro;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int remainder;

        while (originalNumber != 0){
            remainder = originalNumber % 10;
            sum += (int) Math.pow(remainder, 3);
            originalNumber = originalNumber / 10;

        }
        if (sum == number){
            System.out.println("ArmStrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }
        scanner.close();
    }
}
