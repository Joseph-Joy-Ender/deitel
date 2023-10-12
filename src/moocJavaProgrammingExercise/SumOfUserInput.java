package moocJavaProgrammingExercise;

import java.util.Scanner;

public class SumOfUserInput {

    private int sum;

    public SumOfUserInput(){
        this.sum = 0;
    }

    public int getSum(){
        return this.sum;
    }

    public void setNumber(int number){
        this.sum += number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfUserInput sumOfUserInput = new SumOfUserInput();
        System.out.println("Enter numbers: ");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1){
                break;
            }
           sumOfUserInput.setNumber(number);

        }
            System.out.println("Sum " + sumOfUserInput.getSum());


    }
}
