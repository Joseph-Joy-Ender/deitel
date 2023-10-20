package task;

import java.util.Arrays;

public class ArrayOfString {

    public static int stringArray(String[] arrays){
        int count = 0;
        String string = Arrays.toString(arrays);
        for (Character character : string.toCharArray()) {
            if (Character.isDigit(character)) count ++;
        }

        return count;

    }

    
    public static int arrayToString(String[] arrays){
        int counter = 0;
        for (int index = 0; index < arrays.length; index++) {
            String element = arrays[index];
            for (int index2 = 0; index2 < element.length(); index2++) {
                if (element.charAt(index2) >= '0' && element.charAt(index2) <= '9'){
                    counter++;
                }
            }
        }
       return counter;
    }

    public static void main(String[] args) {
        String[] input = {"ABC21F2", "13CPZ0", "A1L6"};
        System.out.println(arrayToString(input));
    }
}
