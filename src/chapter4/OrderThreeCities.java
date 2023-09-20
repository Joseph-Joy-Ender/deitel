package chapter4;

import java.util.Scanner;

public class OrderThreeCities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = scanner.nextLine();
        System.out.print("Enter second city: ");
        String secondCity = scanner.nextLine();
        System.out.print("Enter third city: ");
        String thirdCity = scanner.nextLine();

        if (firstCity.equalsIgnoreCase(secondCity) && firstCity.equalsIgnoreCase(thirdCity)) {
            System.out.println(firstCity);
            if (secondCity.equalsIgnoreCase(thirdCity)) {
                System.out.println(secondCity);
                System.out.println(thirdCity);
            }else {
                System.out.println(thirdCity);
                System.out.println(secondCity);
            }
        } else if (secondCity.equalsIgnoreCase(firstCity) && secondCity.equalsIgnoreCase(thirdCity)) {
            System.out.println(secondCity);
            if (firstCity.equalsIgnoreCase(thirdCity)){
                System.out.println(firstCity);
                System.out.println(thirdCity);
            }else {
                System.out.println(thirdCity);
                System.out.println(firstCity  );
            }
        }
        else {
            System.out.println(thirdCity);
            if (firstCity.equalsIgnoreCase(secondCity)){
                System.out.println(firstCity);
                System.out.println(secondCity);
            }
            else {
                System.out.println(secondCity);
                System.out.println(firstCity);
            }
        }
    }
}