package chapter4;

import java.util.Scanner;

public class NonDecreasingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

//        if (number1 > number2 && number1 > number3)
//            System.out.println(number1);
//        if (number2 > number3) {
//            System.out.println(number2);
//            System.out.println(number3);
//        } else {
//            System.out.println(number3);
//            System.out.println(number2);
//        }

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
            if (number2 > number3) {
                System.out.println(number2);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number2);
            }
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
            if (number1 > number3) {
                System.out.println(number1);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number1);
            }
        } else {
            System.out.println(number3);
            if (number1 > number2) {
                System.out.println(number1);
                System.out.println(number2);
            } else {
                System.out.println(number2);
                System.out.println(number3);
            }
        }
    }
}
