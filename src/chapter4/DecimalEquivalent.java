package chapter4;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer containing 0s and 1s: ");
//        int binary = scanner.nextInt();
//
//        int first = binary / 100 % 10;
//        int second = binary / 10 % 10;
//        int third = binary % 10;

//        int number = 234;
//        int one = (4 * 1) + (3 * 10) + (2 * 100);
//        System.out.println(one);

//

//            int principal = 1000;
//            double rate = 0.03;
//        System.out.printf("%s%20s%n",       "year",        "Amount");
//        for (int year = 1; year <= 10 ; year++) {
//            double amount = principal * Math.pow(1.0 + year, rate);
//
//            System.out.printf("%4d%, 20.2f%n", year, amount);
//
//        }
//
//        System.out.printf("%s%17s%n ",    "Salary",         "Year");
//        for (int salary = 1; salary <= 5 ; salary++) {
//
//                double payment = 1000 * salary;
//                System.out.printf("%4d%,20.2f%n", salary, payment);
//
//            }

//        for (int i = 1; i <= 10 ; i++) {
//            if (i == 5 || i == 7 || i == 10 || i == 4){
//                continue;
//            }
//            System.out.printf("%d ", i);
//        }
//        System.out.printf("%nUsed continue to skip printing 5, 7, 10, 4");
//        }


        for (int year = 1; year <= 5; year++) {

            for (double rate = 0.05; rate <= 0.1; rate++) {
                double amount = 1000.0 * Math.pow(1.0 + rate, year);
                System.out.println(rate);
                System.out.println(amount);

            }
        }
    }

}