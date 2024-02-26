package chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {

    public static int collectInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 30");
        return s.nextInt();
    }

    public static void printAsterisk(int input) {
        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int firstInput = collectInput();
        int secondInput = collectInput();
        int thirdInput = collectInput();
        int fourthInput = collectInput();
        int fifthInput = collectInput();


        System.out.println();
        System.out.println("PRINTING....");
        System.out.println();



        printAsterisk(firstInput);
        printAsterisk(secondInput);
        printAsterisk(thirdInput);
        printAsterisk(fourthInput);
        printAsterisk(fifthInput);


//        int count = 0;
////
//        int number = 0;
//        for (int i = 1; i <= 5 ; i++) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter five numbers between 1 and 30:");
//           number = scanner.nextInt();
//        }
//
//        for (int j = 1; j <= number ; j++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//        System.out.println(count);
    }

}
