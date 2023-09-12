package chapter2;
import java.util.Scanner;
public class Celsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double Celsius = input.nextDouble();

        double fahrenheit =  ((9 / 5) * (Celsius + 32));

        System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
