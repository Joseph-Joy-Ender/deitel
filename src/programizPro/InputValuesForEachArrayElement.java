package programizPro;

import java.util.Scanner;

public class InputValuesForEachArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

//        System.out.println("Enter first number: ");
//        numbers[0] = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        numbers[1] = scanner.nextInt();
//
//        System.out.println("Enter third number: ");
//        numbers[2] = scanner.nextInt();
//
//        System.out.println("Enter fourth number: ");
//        numbers[3] = scanner.nextInt();
//
//        System.out.println("Array Elements: ");
//        for (int number : numbers) {
//            System.out.println(number);
//
//        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter Array Element: ");
            numbers[i] = scanner.nextInt();

        }
        System.out.println("Array Element: ");
        for (int number : numbers) {
            System.out.println(number);

        }

        }

    }

