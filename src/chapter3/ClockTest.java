package chapter3;

public class ClockTest {
    public static void main(String[] args) {
       Clock clock = new Clock(20, 50, 30);
       String result = clock.displayTime();
        System.out.println(result);
    }

}
