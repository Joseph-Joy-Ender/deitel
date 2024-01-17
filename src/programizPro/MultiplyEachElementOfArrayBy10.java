package programizPro;

public class MultiplyEachElementOfArrayBy10 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * 2;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(newNumbers[i]);

        }
    }
}
