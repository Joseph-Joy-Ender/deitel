package beginWithJavaExercises;

import java.util.Scanner;

public class SumOfEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;


        while (true){
            System.out.println("Enter a set of digits, enter 0 to exit: ");
            int digits = scanner.nextInt();
            if (digits == 0){
                break;
            }
             if (digits % 2 == 0) {
                 evenCount+= 1;
             }
             else {
                 oddCount+= 1;
             }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
