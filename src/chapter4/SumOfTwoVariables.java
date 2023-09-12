package chapter4;

import java.util.Scanner;

public class SumOfTwoVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the first number: ");
       // int number1 = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int number2 = scanner.nextInt();
//
//        int sum = (number1 + number2) * 2;
//
//        System.out.println(sum);
//
//        int remainder = number1 % 10;
//
//        int sum = number1 + remainder;
//
//        number1 = remainder + sum;
//
//        System.out.println(sum);
//        System.out.println(number1);
//

//        System.out.println("Enter x: ");
//        int x = scanner.nextInt();
//      //  int n = scanner.nextInt();
//
//      //  int multiply = x * x;
//
//      //  double add = Math.pow(multiply, n);
//      //  System.out.println(add);
//
//        System.out.println("Enter a: ");
//        int a = scanner.nextInt();
//         x = a + 10;
//
//         int y = scanner.nextInt();
//         y = a - 10;
//         int z = scanner.nextInt();
//         z = a / 10;
//
//         int product = x * y * z;
//         int divide = a / product;
//        System.out.println(divide);
//

        int a = 80;
        int x = a + 10;
        int y = a - 10;
        int z = a % 10;

        int multiply = x * y * z;
        int divide = a / multiply;

        System.out.println(divide);
    }
}
