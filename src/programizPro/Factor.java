package programizPro;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                count++;
                System.out.println(i);

            }
        }
        System.out.println(count);
    }
}
