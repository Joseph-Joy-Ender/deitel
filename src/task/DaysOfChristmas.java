package task;

import java.util.Scanner;

public class DaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of christmas: ");
        int days = input.nextInt();

        switch (days) {
            case 1 -> System.out.println("On the first day of christmas");
            case 2 -> System.out.println("On the second day of christmas");
            case 3 -> System.out.println("On the third day of christmas");
            case 4 -> System.out.println("On the fourth day of christmas");
            case 5 -> System.out.println("On the fifth day of christmas");
            case 6 -> System.out.println("On the sixth day of christmas");
            case 7 -> System.out.println("On the seventh day of christmas");
            case 8 -> System.out.println("On the eighth day of christmas");
            case 9 -> System.out.println("On the ninth day of christmas");
            case 10 -> System.out.println("On the tenth day of christmas");
            case 11 -> System.out.println("On the eleventh day of christmas");
            case 12 -> System.out.println("On the twelfth day of christmas");
        }

    }
    private static String myTrueLove() {
        return "my true love brought to me";
    }
}
