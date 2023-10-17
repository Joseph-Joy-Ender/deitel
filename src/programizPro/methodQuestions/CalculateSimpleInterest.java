package programizPro.methodQuestions;

import java.util.Scanner;

public class CalculateSimpleInterest {

    public static double simpleInterest(double principal, double time, double rate){
        return (principal * time * rate) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal, time and rate: ");
        double principal = scanner.nextDouble();
        double time = scanner.nextDouble();
        double rate = scanner.nextDouble();

        System.out.println(simpleInterest(principal, time, rate));

    }
}
