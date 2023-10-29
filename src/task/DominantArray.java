package task;

public class DominantArray {


    public static int[] findDominantElements(int[] input) {
        for (int index = 0; index < input.length; index++) {
            int currentIndex = input[index];
            for (int index2 = index + 1; index2 < input.length ; index2++) {
                if (currentIndex < input[index2]) break;

            }

        }
        return null;
    }
}
