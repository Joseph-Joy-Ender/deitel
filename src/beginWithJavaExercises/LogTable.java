package beginWithJavaExercises;

import java.util.Scanner;

public class LogTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter last number: ");
        int maxValue = scanner.nextInt();

        for (int i = 1; i <= maxValue ; i++) {
            System.out.println(i + "\t" + Math.log(i));
        }
    }
}
