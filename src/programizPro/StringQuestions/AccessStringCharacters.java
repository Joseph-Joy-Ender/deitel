package programizPro.StringQuestions;

import java.util.Scanner;

public class AccessStringCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            String result = String.valueOf(text.charAt(i));
            System.out.println(result);
        }

    }
}
