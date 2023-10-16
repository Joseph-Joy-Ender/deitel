package chibuzo_task;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] items = {{34, 23, 65}, {23, 67, 44, 68}, {12, 13, 14}};
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t\t ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                sum += items[i][j];
            }
            System.out.println(sum);
        }

//        for (int[] item : items) {
//            for (int i : item) {
//                System.out.print(i + " \t");
//            }
//            System.out.println();
//
//        }


    }
}

