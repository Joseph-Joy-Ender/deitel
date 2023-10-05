package beginWithJavaExercises.ArraysAndArrayList;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Enter the array size: ");
        size = scanner.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + list.length + " integers. ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        int max = list[0];
        int min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max){
                max = list[i];
            }
            if (list[i] < min){
                min = list[i];
            }
        }
        System.out.println("Largest element: " + max + "\n Smallest element: " + min);
    }
}
