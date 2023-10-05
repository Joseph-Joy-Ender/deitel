package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers. ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        int temp;
        for (int i = 0; i < list.length / 2; i++) {
            temp = list[i];

            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }
        System.out.println("Reverse array: ");
        for (int j : list) {
            System.out.println(j);

        }
    }
}
