package chapter1;

public class AverageSpeed {

    public static void main(String[] args) {

        int kilometer = 14;
        int minutes = 45;
        int seconds = 30;
        double miles = 8699;
        double speed = minutes + seconds / miles;
        double perHour = miles / speed;

        System.out.printf("The average speed per hour is %.4f%n",  perHour);
    }
}
