package programizPro;
import java.util.Scanner;

public class ComparingFirstAndLastArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      // int[] numbers = new int[6];
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers " + (i + 1));
             numbers[i] = scanner.nextInt();
        }

        int first = numbers[0];
        int last = numbers[5];

            if (first == last){
                System.out.println("Equal");
            }else {
                System.out.println("Not Equal");
            }

    }
}
