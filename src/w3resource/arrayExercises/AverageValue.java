package w3resource.arrayExercises;

public class AverageValue {

    public int[] averageValue(int[] arrays) {
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < arrays.length; i++) {
            sum +=  arrays[i];
            average = (double) sum / arrays.length;

        }
        return new int[]{(int) average};
    }
}
