package task;

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of day:   ");
        int day = input.nextInt();

        switch (day) {
            case 0 -> {
                System.out.println("Enter future date");
                int sunday = input.nextInt();
                switch (sunday) {
                    case 0 -> System.out.println("Today is still Sunday");
                    case 1 -> System.out.println("Today is Sunday and future day is Monday");
                    case 2 -> System.out.println("Today is Sunday and future day is Tuesday");
                    case 3 -> System.out.println("Today is Sunday and future day is Wednesday");
                    case 4 -> System.out.println("Today is Sunday and future day is Thursday");
                    case 5 -> System.out.println("Today is Sunday and future day is Friday");
                    case 6 -> System.out.println("Today is Sunday and future day is Saturday");
                }
            }
            case 1 -> {
                System.out.println("Enter future date: ");
                int monday = input.nextInt();
                switch (monday) {
                    case 0 -> System.out.println("Today is still Monday");
                    case 1 -> System.out.println("Today is Monday and future day is Tuesday");
                    case 2 -> System.out.println("Today is Monday and future day is Wednesday");
                    case 3 -> System.out.println("Today is Monday and future day is Thursday");
                    case 4 -> System.out.println("Today is Monday and future day is Friday");
                    case 5 -> System.out.println("Today is Monday and future day is Saturday");
                    case 6 -> System.out.println("Today is Monday and future day is Sunday");
                }
            }
            case 2 -> {
                System.out.println("Enter future date: ");
                int tuesday = input.nextInt();
                switch (tuesday) {
                    case 0 -> System.out.println("Today is still Tuesday");
                    case 1 -> System.out.println("Today is Tuesday and future day is Wednesday");
                    case 2 -> System.out.println("Today is Tuesday and future day is Thursday");
                    case 3 -> System.out.println("Today is Tuesday and future day is Friday");
                    case 4 -> System.out.println("Today is Tuesday and future day is Saturday");
                    case 5 -> System.out.println("Today is Tuesday and future day is Monday");
                    case 6 -> System.out.println("Today is Tuesday and future day is Tuesday");
                }
            }
            case 3 -> {
                System.out.println("Enter future date: ");
                int wednesday = input.nextInt();
                switch (wednesday) {
                    case 0 -> System.out.println("Today is still Wednesday");
                    case 1 -> System.out.println("Today is Wednesday and future day is Thursday");
                    case 2 -> System.out.println("Today is Wednesday and future day is Friday");
                    case 3 -> System.out.println("Today is Wednesday and future day is Saturday");
                    case 4 -> System.out.println("Today is Wednesday and future day is Sunday");
                    case 5 -> System.out.println("Today is Wednesday and future day is Monday ");
                    case 6 -> System.out.println("Today is Wednesday and future day is Tuesday");
                }
            }
            case 4 -> {
                System.out.println("Enter future date: ");
                int thursday = input.nextInt();
                switch (thursday) {
                    case 0 -> System.out.println("Today is still Thursday");
                    case 1 -> System.out.println("Today is Thursday and future day is Friday");
                    case 2 -> System.out.println("Today is Thursday and future day is Saturday");
                    case 3 -> System.out.println("Today is Thursday and future day is Sunday");
                    case 4 -> System.out.println("Today is Thursday and future day is Monday");
                    case 5 -> System.out.println("Today is Thursday and future day is Tuesday ");
                    case 6 -> System.out.println("Today is Thursday and future day is Wednesday");
                }
            }
            case 5 -> {
                System.out.println("Enter future date: ");
                int friday = input.nextInt();
                switch (friday) {
                    case 0 -> System.out.println("Today is still Friday");
                    case 1 -> System.out.println("Today is Friday and future day is Saturday");
                    case 2 -> System.out.println("Today is Friday and future day is Sunday");
                    case 3 -> System.out.println("Today is Friday and future day is Monday");
                    case 4 -> System.out.println("Today is Friday and future day is Tuesday");
                    case 5 -> System.out.println("Today is Friday and future day is Wednesday ");
                    case 6 -> System.out.println("Today is Friday and future day is Thursday");
                }
            }
            case 6 -> {
                System.out.println("Enter future date: ");
                int saturday = input.nextInt();
                switch (saturday) {
                    case 0 -> System.out.println("Today is still Saturday");
                    case 1 -> System.out.println("Today is Saturday and future day is Sunday");
                    case 2 -> System.out.println("Today is Saturday and future day is Monday");
                    case 3 -> System.out.println("Today is Saturday and future day is Tuesday");
                    case 4 -> System.out.println("Today is Saturday and future day is Wednesday");
                    case 5 -> System.out.println("Today is Saturday and future day is Thursday");
                    case 6 -> System.out.println("Today is Saturday and future day is Friday");
                }
            }
        }
    }
}