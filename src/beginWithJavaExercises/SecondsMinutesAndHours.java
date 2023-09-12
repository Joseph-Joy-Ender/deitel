package beginWithJavaExercises;

import java.util.Scanner;

public class SecondsMinutesAndHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds as integers: ");
        int seconds = scanner.nextInt();

        int totalSeconds = seconds % 60;
        int totalMinutes = seconds / 60;
        int currentMinutes = totalMinutes % 60;
        int totalHour = totalMinutes / 60;
        int currentHour = totalHour % 24;

        System.out.println("Hours: " + currentHour);
        System.out.println("Minutes: " + currentMinutes);
        System.out.println("Seconds: " + totalSeconds);
    }
}
