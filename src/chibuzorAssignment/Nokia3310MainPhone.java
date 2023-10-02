package chibuzorAssignment;

import java.util.Scanner;

public class Nokia3310MainPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Nokia3310Phone phone = new Nokia3310Phone();
        Nokia3310Phone.menu();
        int map = scanner.nextInt();
        phone.mainMenu(map);
    }
}
