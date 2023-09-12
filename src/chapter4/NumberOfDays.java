package chapter4;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        int number = scanner.nextInt();

        while (number > 6){
            System.out.println("Enter day of week");
            number = scanner.nextInt();
        }

        switch (number) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");

        }
    }
}
