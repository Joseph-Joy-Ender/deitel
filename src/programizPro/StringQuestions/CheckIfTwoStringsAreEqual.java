package programizPro.StringQuestions;

import java.util.Scanner;

public class CheckIfTwoStringsAreEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
