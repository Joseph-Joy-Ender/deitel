package programizPro.methodQuestions;

import java.util.Scanner;

public class ComputeTheAreaOfACircle {

    public static double computeArea(double radius, double pi){

        return pi * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius for area: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        System.out.println(computeArea(radius, pi));
    }
}
