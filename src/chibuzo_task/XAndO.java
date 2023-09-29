package chibuzo_task;

import java.util.Arrays;

public class XAndO {
    public static void main(String[] args) {
        char[][] xAndO;

        xAndO = new char[][]{{'x', 'o', 'x'}, {'x', 'x', 'o'}, {'o', 'x', 'x'}};
        System.out.println(Arrays.deepToString(xAndO));

        for (char[] chars : xAndO) {
            for (int o = 0; o < xAndO.length; o++) {
                System.out.print(chars[o] + "|" + " ");
            }
            System.out.println();

        }
    }
}
