package beginWithJavaExercises.ArraysAndArrayList;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        int[] list = new int[size];

        int options;

        do {
            System.out.println("Menu ");
            System.out.println("1. Read Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search an item in array");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");
            System.out.print("Select an Option: ");
            options = scanner.nextInt();

            switch (options) {
                case 1 -> readArray(list);
                case 2 -> displayArray(list);
                case 3 -> {
                    System.out.print("Enter the number you want to search: ");
                    int item = scanner.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1) {
                        System.out.println("Item not found");
                    } else {
                        System.out.println("Item found at position " + (index + 1));
                    }
                }
                case 4 -> {
                    System.out.println("Sorted array: ");
                    sortedArray(list);
                    displayArray(list);
                }
            }
        }    while (options != 5);

    }
    public static void readArray(@NotNull int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static void displayArray(@NotNull int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    @Contract(pure = true)
    static int searchArray(@NotNull int[]array, int data){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }

    static void sortedArray(@NotNull int[] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }

}
