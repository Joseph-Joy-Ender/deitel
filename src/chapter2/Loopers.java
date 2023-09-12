package chapter2;

public class Loopers {
    public static void main(String[] args) {

        int count = 0;
        while (count < 5) {
            System.out.println("Welcome to Semicolon");
            count++;
        }
        int sum = 0, i = 1;
        while (i < 10 ){
            sum = sum + i;
            i++;
        }
        System.out.println("sum is " + sum);
    }
}