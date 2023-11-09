package leetCode.ArrayQuestions;

import java.util.Arrays;

public class RichestCustomerWealth {

    public int[] maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        int largest = sum[0];
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                sum[row] += accounts[row][col];

            }

        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Customer " + (i + 1) + " has wealth " + sum[i]);
            if (sum[largest] < sum[i]) largest = i;


        }

        return new int[]{sum[largest]};
    }

    public static void main(String[] args) {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(Arrays.toString(richestCustomerWealth.maximumWealth(accounts)));
    }
}
