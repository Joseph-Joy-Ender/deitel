package chapter1;

import chibuzorAssignment.Nokia3310Phone;

import java.util.Scanner;

public class Phones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Nokia3310Phone phone = new Nokia3310Phone();
        phone.menu();
        int map = scanner.nextInt();
        phone.mainMenu(map);
    }
}
