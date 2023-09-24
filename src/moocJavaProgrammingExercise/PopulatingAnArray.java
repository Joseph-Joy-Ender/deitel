package moocJavaProgrammingExercise;

import java.util.Arrays;

public class PopulatingAnArray {
    public static void main(String[] args) {

        int [] number = new int[5];
        int count = 0;

        for (int i = 10; i <= 50 ; i += 10) {
            number[count] = i;
            count++;

        }
        System.out.println(Arrays.toString(number));



   }
}
