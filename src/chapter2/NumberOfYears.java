package chapter2;
import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of minutes: ");
  double minutes = input.nextLong();

  double year = minutes / 525_000;
  double day = minutes / 1440;

  System.out.print(minutes + " minutes is approximately "  +  year  +  " day ");
    }

}
