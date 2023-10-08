package programizPro;

public class StandardDeviation {


    public static int calculateSD(int[] numbers){
        double sum = 0.0;
        for (int number : numbers) {
            sum += number;

        }
        double mean = sum / numbers.length;
        double result = 0.0;
        for (int i = 0; i < numbers.length; i++) {

        }
        return (int) sum;
    }
}
