package programizPro;

import java.util.Arrays;
import java.util.Scanner;

public class ChangingAnElementOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int[] primeNumbers = {2, 3, 5, 7};

        primeNumbers[3] = number;

        System.out.println(Arrays.toString(primeNumbers));


    }
}
