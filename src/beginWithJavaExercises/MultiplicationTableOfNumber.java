package beginWithJavaExercises;

import java.util.Scanner;

public class MultiplicationTableOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 12 ; i++) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);

        }
    }
}
