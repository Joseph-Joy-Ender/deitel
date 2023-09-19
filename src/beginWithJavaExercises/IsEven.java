package beginWithJavaExercises;

import java.util.Scanner;

public class IsEven {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean result = isEven(number);
        System.out.println(result);
    }
}
