package programizPro;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {55, 64, 75, 80, 65};
        int smallest = numbers[3];

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println(smallest);
    }
}
