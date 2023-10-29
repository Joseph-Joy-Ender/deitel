package beginWithJavaExercises.ArraysAndArrayList;



public class BinarySearchArray {

    public static String binarySearch(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
       // int index = Arrays.binarySearch(array, target);
        int index = binarySearching(array, target);
        if (index == -1){
            return target + " Element not found";
        }
        else {
            return "Element found at: " + index;
        }
    }

    private static int binarySearching(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("Middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle -1;
            else return middle;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        int target = 7777;
        System.out.println(binarySearch(array, target));
    }
}
