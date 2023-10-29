package beginWithJavaExercises.ArraysAndArrayList;

public class SearchingAnArray {
    
    public static String elementFoundAt(int[] array, int value){
        int index = linearSearch(array, value);
        if (index != -1){
            return "Element found at index: " + index;
        }else {
            return "Element not found";
        }

    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = 1;
        System.out.println(elementFoundAt(array, index));
    }
}
