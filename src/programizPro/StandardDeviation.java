package programizPro;

public class StandardDeviation {


    public static double calculateSD(int[] numbers) {
        double sum = 0;
        double difference;
        double squareDifference;
        double variance = 0;
        double result = 0;
        double sd;
        double mean;
        for (int number : numbers) {
            sum += number;

        }
         mean = sum / numbers.length;
        for (int count : numbers) {
            difference = mean - count;
            squareDifference = Math.pow(difference, 2);
            result += squareDifference;
        }
        variance += result / numbers.length;
        sd = Math.sqrt(variance);

        return  sd;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 12, 21, 11, 14};
        System.out.println(calculateSD(numbers));
    }
}
