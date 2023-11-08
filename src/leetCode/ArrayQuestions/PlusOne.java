package leetCode.ArrayQuestions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOnes = new PlusOne();
        int[] array = {90};
        System.out.println(Arrays.toString(plusOnes.plusOne(array)));
    }

    public int[] plusOne(int[] digits) {
        String num = lastDigitPlusOne(digits);
        int[] newArray = new int[digits.length + num.length() - 1];
        putInTheNumber(digits, newArray, num);
        return newArray;
    }

    private static void putInTheNumber(int[] digits, int[] newArray, String num) {
        int counter;
        for (counter = 0; counter < digits.length - 1; counter++) {
            newArray[counter] = digits[counter];
        }
        for (int j = 0; j < num.length(); j++) {
            newArray[counter] = Integer.parseInt(String.valueOf(num.charAt(j)));
            counter++;
        }
    }

    private static String lastDigitPlusOne(int[] digits) {
        String num = "";
        String number = String.valueOf(digits[digits.length - 1]);
        for (int count = 0; count < number.length(); count++) {
            if (count == number.length() - 1) {
                int numb = Integer.parseInt(String.valueOf(number.charAt(count))) + 1;
                num += numb;
                continue;
            }
            num += String.valueOf(number.charAt(count));
        }
        return num;
    }

}





