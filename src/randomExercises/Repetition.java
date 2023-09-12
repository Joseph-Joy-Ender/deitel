package randomExercises;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Java Programming is fun");
        }
        Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int sum = 0;
        for (int i = 1; i <= number ; ++i) {
            sum = sum + i;
        }
            System.out.println(sum);


    }
}
