package beginWithJavaExercises.ArraysAndArrayList;

public class SortingAnArrayInDescendingOrder {

    public static void sorted(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 7, 8, 5};
        sorted(array);
        for (int i : array) {
            System.out.println(i);

        }
    }
}
