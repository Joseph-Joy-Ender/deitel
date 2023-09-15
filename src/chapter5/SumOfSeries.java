package chapter5;

public class SumOfSeries {
    public static void main(String[] args) {


        int sum = 0;

        System.out.printf("%s%20s%n", "Number", "Sum");
        for (long number = 1; number <= 100; number++) {

            sum += (int) number;

            System.out.printf("%4d  %20d%n", number, sum);

        }
    }
}
