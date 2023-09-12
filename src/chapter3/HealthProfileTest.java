package chapter3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile();

        display("Enter your first name: ");
        String firstName = input.nextLine();
        healthProfile.setFirstName(firstName);

        display("Enter your last name: ");
        String lastName = input.nextLine();
        healthProfile.setLastName(lastName);

        display("Preferred gender: ");
        String gender = input.nextLine();
        healthProfile.setGender(gender);

        display("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        healthProfile.setDayOfBirth(dayOfBirth);

        display("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        healthProfile.setMonthOfBirth(monthOfBirth);

        display("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        healthProfile.setYearOfBirth(yearOfBirth);

        display("Enter your height: ");
        double height = input.nextDouble();
        healthProfile.setHeight(height);

        display("Enter your weight: ");
        double weight = input.nextDouble();
        healthProfile.setWeight(weight);

        display("your first name is " + healthProfile.getFirstName());
        display("Your last name is " + healthProfile.getLastName());
        display("Specified gender is " + healthProfile.getGender());
        display("Month of birth is " + healthProfile.getMonthOfBirth());
        display("Day of birth is " + healthProfile.getDayOfBirth());
        display("Year of birth is " + healthProfile.getYearOfBirth());
        display("Height is " + healthProfile.getHeight());
        display("Weight is " + healthProfile.getWeight());
        display("Age in years is " + healthProfile.getAge());
        display("Body Mass Index is " + healthProfile.bodyMassIndex());
        display("Maximum heart rate is " + healthProfile.maximumHeartRate());
        display("Target heart rate is " + healthProfile.targetHeartRate());
        display("Maximum target heart rate is " + healthProfile.minimumTargetHeartRate());

    }
    private static void display(String input){
        System.out.println(input);
    }
}
