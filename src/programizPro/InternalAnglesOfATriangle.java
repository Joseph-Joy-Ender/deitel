package programizPro;

import java.util.Scanner;

public class InternalAnglesOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x, y and z: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int sum = x + y + z;

        System.out.println(sum == 180);

    }
}
