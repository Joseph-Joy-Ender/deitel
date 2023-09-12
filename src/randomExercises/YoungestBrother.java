package randomExercises;

import java.util.Scanner;

public class YoungestBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int jack = input.nextInt();
//        int roman = input.nextInt();
//        int johnny = input.nextInt();
//        //  System.out.println("Enet");
//        if (jack < roman && jack < johnny) {
//            System.out.println("Jack is the smallest  ");
//        } else if (roman < johnny) {
//            System.out.println("Roman is the smallest  ");
//        } else {
//            System.out.println("Johnny is the smallest ");
//
//        }
//
//        int eldest;
//        int Joy = input.nextInt();
//        int Miracle = input.nextInt();
//        int Martha = input.nextInt();
//
//        if (Joy > Miracle) {
//            if (Martha > Joy) {
//                eldest = Martha;
//            } else {
//                eldest = Joy;
//            }
//        } else {
//            if (Miracle > Martha) {
//                eldest = Miracle;
//            } else {
//                eldest = Martha;
//            }
//        }
//        System.out.println(eldest + " is the eldest. ");

        int Joy = 20;
        int Miracle = 24;
        int Martha = 22;

        int smallest = (Joy < Miracle) ? (Joy < Martha ? Joy : Martha) : (Miracle < Martha ? Miracle : Martha);

        System.out.println("Smallest is " + smallest);
    }

}