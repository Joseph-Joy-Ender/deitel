package programizPro;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {

        int[] numbers = {55, 64, 75, 80, 65};

        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        System.out.println("New Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(newNumbers[i]);

        }
    }
}
