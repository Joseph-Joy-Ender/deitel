package chapter6;

public class SumOfDigits {

    public static int sumOfDigits(int numbers){
        int number = numbers;
        int sum = 0;
        int digits;

       // if (numbers < 4) System.out.println("Number must be four-digits long");

        while (number != 0) {

                digits = number % 10;
                sum += digits;

                number /= 10;

            }

        return sum;
    }
}
