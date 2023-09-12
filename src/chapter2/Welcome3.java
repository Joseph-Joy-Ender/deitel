package chapter2;
import java.util.Scanner;
public class Welcome3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String names = input.nextLine();

        System.out.println( " Hello" + " " + names );
    }
}
