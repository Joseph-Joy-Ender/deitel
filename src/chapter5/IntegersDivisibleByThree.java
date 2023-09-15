package chapter5;

public class IntegersDivisibleByThree {
    public static void main(String[] args) {

        int total = 0;

        for (int number = 1; number <= 30 ; number++) {
            if (number % 3 == 0){
                 total += number;
            }

        }
        System.out.println("The sum of integers between 1 and 30 that is divisible by 3 is " + total);
    }
}
