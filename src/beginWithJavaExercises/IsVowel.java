package beginWithJavaExercises;

import java.util.Scanner;

public class IsVowel {


    public static boolean isVowel(char letter){
        return switch (letter) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String alphabet = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < alphabet.length() ; i++) {
            if (isVowel(alphabet.charAt(i))){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
