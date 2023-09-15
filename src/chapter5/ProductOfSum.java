package chapter5;

public class ProductOfSum {
    public static void main(String[] args) {

        System.out.printf("%s%20s%n", "Number", "product");
        for (int number = 1; number <= 50; number++) {
            int product = number * number;

            System.out.printf("%4d  %20d%n", number, product);


        }
    }
}
