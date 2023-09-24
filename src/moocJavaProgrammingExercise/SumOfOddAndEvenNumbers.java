package moocJavaProgrammingExercise;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    private int sum;
    private int sumOfEven;
    private int sumOfOdd;

    public SumOfOddAndEvenNumbers(){
        this.sum = 0;
        this.sumOfEven = 0;
        this.sumOfOdd = 0;
    }

    public void addNumber(int number){
        this.sum += number;
        this.sumOfEven += number;
        this.sumOfOdd += number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SumOfOddAndEvenNumbers sum = new SumOfOddAndEvenNumbers();
        SumOfOddAndEvenNumbers sumOfEven = new SumOfOddAndEvenNumbers();
        SumOfOddAndEvenNumbers oddSum = new SumOfOddAndEvenNumbers();

        System.out.println("Enter numbers: ");

        while (true){
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1){
                break;
            }

            sum.addNumber(number);

            if (number % 2 == 0){
                sumOfEven.addNumber(number);
            }else {
                oddSum.addNumber(number);
            }
        }

        System.out.println("Sum: " + sum.sum);
        System.out.println("Even: " + sumOfEven.sumOfEven);
        System.out.println("Odd: " + oddSum.sumOfOdd);
    }
}
