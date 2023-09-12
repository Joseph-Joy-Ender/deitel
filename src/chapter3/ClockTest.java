package chapter3;

public class ClockTest {
    public static void main(String[] args) {
       Clock clock = new Clock(20, 60, 64);
       String result = clock.displayTime();
        System.out.println(result);
    }

}
