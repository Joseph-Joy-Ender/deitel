package chapter3;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HeartRate heartRate = new HeartRate("Joy", "Joseph", 1, 6, 2003);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        heartRate.setFirstName(firstName);

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        heartRate.setLastName(lastName);

        System.out.print("Enter day of birth: ");
        int dayOfBirth = input.nextInt();
        heartRate.setDayOfBirth(dayOfBirth);

        System.out.print("Enter month of birth: ");
        int monthOfBirth = input.nextInt();
        heartRate.setMonthOfBirth(monthOfBirth);

        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();
        heartRate.setYearOfBirth(yearOfBirth);

        System.out.println();

        System.out.println("The first name is: " + heartRate.getFirstName());
        System.out.println("The last name is: " + heartRate.getLastName());
        System.out.println("The day of birth is: " + heartRate.getDayOfBirth());
        System.out.println("The month of birth is: " + heartRate.getMonthOfBirth());
        System.out.println("The year of birth is: " + heartRate.getYearOfBirth());
        System.out.println("Age in year is: " + heartRate.getAgeInYear());
        System.out.println("Your maximum heart rate is: " + heartRate.getMaximumHeartRate());
        System.out.println("Your target maximum heart rate is: " + heartRate.targetHeartRate());
        System.out.println("Your target minimum heart rate is: " + heartRate.minimumTargetHeartRate());
    }
}
