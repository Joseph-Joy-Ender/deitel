package programizPro.StringQuestions;

import java.util.Scanner;

public class NumberOfVowelsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String string = scanner.nextLine();

        String result = string.toLowerCase();
        int vowels = 0;

        for (int i = 0; i < result.length(); i++) {
           char x = string.charAt(i);

           if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
               vowels ++;
           }
        }
        System.out.println(vowels);
    }
}
