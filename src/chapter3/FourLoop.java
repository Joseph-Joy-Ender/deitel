package chapter3;

public class FourLoop {
    public static void main(String[] args) {

        System.out.println("     ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " | ");
            for (int j = 0; j < i; j++) {
                System.out.printf ("%4d", i * j);

            }
            System.out.println();
        }
    }
}
