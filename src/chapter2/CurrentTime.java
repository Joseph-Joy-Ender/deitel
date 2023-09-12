package chapter2;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int time = scanner.nextInt();

        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;


//       long totalSeconds = totalMilliSeconds / 1000;
//        long currentSeconds = totalSeconds % 60;
//        long totalMinutes = totalSeconds / 60;
//        long currentMinutes = totalMinutes % 60;
//        long totalHours = totalMinutes / 60;
//        long currentHour = totalHours % 24;

        System.out.println("The current time  is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
