package task;

import java.util.Scanner;

public class GeopoliticalZonesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a state? ");
        String state = scanner.nextLine();

        for (GeoPoliticalZones geoPoliticalZones: GeoPoliticalZones.values()) {
            for (int i = 0; i < geoPoliticalZones.getZones().length; i++) {
                if (geoPoliticalZones.getZones()[i].equals(state)){
                    System.out.println(geoPoliticalZones);
                }

            }

        }





    }
}
