package chapter4;

public class BinaryToDecimal {

    public static int convertBinaryToDecimal(int binary){

        String binaryString = String.valueOf(binary);

        int num = 0;
        int exponential = 0;

        for (int i = binaryString.length() - 1; i >= 0; i --){
            char bit = binaryString.charAt(i);
            if (bit == '1') num += (int) Math.pow(2, exponential);
            exponential++;
        }

        return num;

    }


}
