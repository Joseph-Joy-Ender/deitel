package chapter4;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;

            System.out.print("What is " + number1 + " - " + number2 + " ? ");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("Excellent!");
            }else {
            System.out.println("Wrong answer.");
        }
        System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));
        }
    }
}
