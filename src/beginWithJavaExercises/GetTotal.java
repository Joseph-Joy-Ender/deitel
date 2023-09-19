package beginWithJavaExercises;

import java.util.Scanner;

public class GetTotal {

    public static int getTotal(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number and second number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
      int result =  getTotal(firstNumber, secondNumber);
        System.out.println(result);
    }
}
