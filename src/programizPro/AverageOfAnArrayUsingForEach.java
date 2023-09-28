package programizPro;

public class AverageOfAnArrayUsingForEach {
    public static void main(String[] args) {
        double sum = 0.0;
        double[] numbers = {4.2, 5.5, 2.0, 8.2, 9.6};

        for (double number: numbers) {
            sum += number;
        }
            double total = sum / numbers.length;

        System.out.println(total);
        }
    }

