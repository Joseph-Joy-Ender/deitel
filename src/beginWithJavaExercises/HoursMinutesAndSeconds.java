package beginWithJavaExercises;

public class HoursMinutesAndSeconds {
    public static void main(String[] args) {

        int seconds = 4205;
        int totalSeconds = seconds % 60;
        int totalMinutes = seconds / 60;
        int currentMinutes = totalMinutes % 60;
        int totalHour = totalMinutes / 60;
        int currentHour = totalHour % 24;

        System.out.println(seconds + " seconds gives " + currentHour + " hours " + " : "  + currentMinutes + " minutes " + " : " + totalSeconds + " seconds ");
        System.out.println("Hours: " + currentHour);
        System.out.println("Minutes: " + currentMinutes);
        System.out.println("Seconds: " + totalSeconds);
    }
}
