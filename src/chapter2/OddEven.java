package chapter2;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int digit = input.nextInt();

        if(digit % 2 == 0) {
            System.out.println("even number ");
        }
        else{
            System.out.println("odd number");
        }
    }
}
