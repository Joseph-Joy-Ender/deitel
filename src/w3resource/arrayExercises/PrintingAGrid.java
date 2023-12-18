package w3resource.arrayExercises;

import java.util.Arrays;

public class PrintingAGrid {
    public String[] printAGrid(String[] arrays){
        for (String array : arrays) {
            Arrays.fill(array.toCharArray(), '-');

        }
        return arrays;
    }

    public static void main(String[] args) {
        PrintingAGrid print = new PrintingAGrid();
        String[] a = new String[10];
        Arrays.fill(a, "-");
        System.out.println(" " + Arrays.toString(a));

    }
}
