package programizPro;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 9;
        int count = 1;

        while (count <= 10) {
            count++;

            System.out.printf("%d * %d = %d \n ", number, count, number * count);
        }
    }
}
