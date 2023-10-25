package chapter4;

import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) % 2 == 1){
                System.out.println(i);
            }

        }
    }
}
