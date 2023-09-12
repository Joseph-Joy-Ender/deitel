package chapter4;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                press
                1 -> Data Plans
                2 -> Recharge
                3 -> Account Balance
                4 -> Data Balance
                """);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                System.out.println("Data Plans");
                System.out.println("""
                        press
                        1 -> N500/1GB/2 days
                        2 -> N700/2.5GB/5 days
                        3 -> N1500/6GB/7 days
                        4 -> N2000/6.5GB/14 days
                        5 -> N3000/11GB/30 days
                        6 -> N5000/22GB/30 days
                        """);
                System.out.print("Select data plan: ");
                int dataPlan = input.nextInt();
                if (dataPlan == 1) System.out.println("Data plan of N500 has been activated");
                if (dataPlan == 2) System.out.println("Data plan of N700 has been activated");
                if (dataPlan == 3) System.out.println("Data plan of N1500 has been activated");
                if (dataPlan == 4) System.out.println("Data plan of N2000 has been activated");
                if (dataPlan == 5) System.out.println("Data plan of N3000 has been activated");
                if (dataPlan == 6) System.out.println("Data plan of N5000 has been activated");
            }

            case 2 -> {
                System.out.println("Recharge");
                System.out.println("Press *131*RechargePIN# ");
            }
            case 3 -> {
            System.out.println("Account Balance");
            System.out.println("Press *123# to check account balance");
        }
            case 4 -> {
                System.out.println("Data Balance");
                System.out.println("Press *140# to check data balance");
            }
        }
    }
}
