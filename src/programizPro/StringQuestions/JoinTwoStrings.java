package programizPro.StringQuestions;

import java.util.Scanner;

public class JoinTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first text: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter second text: ");
        String text2 = scanner.nextLine();

        String newResult = text1 + " ";
        String result = newResult.concat(text2);
        System.out.println(result);
    }
}
