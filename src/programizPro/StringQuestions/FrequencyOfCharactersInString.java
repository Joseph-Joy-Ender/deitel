package programizPro.StringQuestions;

import java.util.Scanner;

public class FrequencyOfCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = 'a';

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
           if (text.charAt(i) == ch){
               count ++;
           }

        }
        System.out.println(count);
    }
}
