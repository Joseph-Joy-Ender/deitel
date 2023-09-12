package chapter4;

public class FirstNumbers {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        int fourthNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;

        System.out.println("First number is " + fourthNumber);
        System.out.println("Second number is " + firstNumber);
        System.out.println("Third number is " + secondNumber);
   }
}
