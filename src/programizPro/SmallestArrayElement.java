package programizPro;

import java.util.Scanner;

public class SmallestArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers " + (i + 1));
            numbers[i] = scanner.nextInt();

            if (numbers[i] < smallest) smallest = numbers[i];
        }
        System.out.println(numbers[smallest]);
    }
}
