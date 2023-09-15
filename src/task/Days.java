package task;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day: ");
       // int day = scanner.nextInt();
        int day = 3;
        String dayName;

        switch (day) {
            case 1 -> dayName = "Sunday";
            case 2 -> dayName = "Monday";
            case 3 -> dayName = "Tuesday";
            default -> {
                dayName = "Invalid day";
                System.out.println("Day is " + dayName);
            }
        }
    }
}
