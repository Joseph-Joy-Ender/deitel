package beginWithJavaExercises;

import java.util.Scanner;

public class SumOfTenNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 natural numbers: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number ; ++i) {
            sum = sum + i;
        }
            System.out.println("The sum of ten natural numbers is: " + sum);

    }
}
