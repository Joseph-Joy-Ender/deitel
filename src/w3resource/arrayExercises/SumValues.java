package w3resource.arrayExercises;

public class SumValues {
    public int[] sumAnArray(int[] arrays) {
        int sum = 0;
        for (int array : arrays) {
            sum += array;

        }
        return new int[]{sum};
    }
}
