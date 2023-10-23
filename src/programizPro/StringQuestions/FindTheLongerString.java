package programizPro.StringQuestions;

import java.util.Scanner;

public class FindTheLongerString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String text2 = scanner.nextLine();

        String string1 = String.valueOf(text1.length());
        String string2 = String.valueOf(text2.length());

        if (string1.equals(string2)){
            System.out.println(text1);
        }else {
            System.out.println(text2);
        }


    }
}
