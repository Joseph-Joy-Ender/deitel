package randomExercises;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

            int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if(number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }

        System.out.printf("GCD of %d and %d is: %d", number1, number2, gcd);

//        int number = 12;
//        int number3 = 4;
//      // int gcd = 1;
//        for (int i = 1; i <= number && i <= number3 ; i++) {
//            if (number % i == 0 && number3 % i == 0){
//                 gcd = i;
//            }
//        }
//        System.out.printf("GCD of number and number3 is: %d", number, number3, gcd );
        }
    }

