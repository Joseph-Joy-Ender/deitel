package chibuzo_task;

import java.util.Stack;

public class BinaryAndDecimalConversion {


    public static void decimalToBinary(int decimalNumber){
        Stack<Integer> stack = new Stack<>();
        while (decimalNumber != 0){
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;

        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static int binaryToDecimal(String binaryNumber){
        int j = 0;
        int sum = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int x = Integer.parseInt(String.valueOf(binaryNumber.charAt(j)));
            int y = (int)Math.pow(2, i);
            sum += (x * y);
            j++;
        }
        return sum;
    }

}
