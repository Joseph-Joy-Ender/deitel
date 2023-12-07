package cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaRoom {
    static final int number_1 = 1;
    static final int number_2 = 2;
    static final int number_3 = 3;
    static final int number_0 = 0;
    static int ticketPrice = 0;
    static int numberOfSeatSoldCounter = 0;
    static int currentIncome = 0;
    static int totalIncome = 0;
    static ArrayList<ArrayList<Character>> allRows = new ArrayList<ArrayList<Character>>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
       int numberOfRows = scanner.nextInt();

        System.out.println("Enter number of seats in each row: ");
        int numberOfSeatInEachRow = scanner.nextInt();

        int totalNumberOfSeat = numberOfRows * numberOfSeatInEachRow;

        if (totalNumberOfSeat <= 60){
            totalIncome = totalNumberOfSeat * 10;
        }else {
            if(numberOfRows % 2 == 0) {
                totalIncome = ((numberOfRows / 2) * numberOfSeatInEachRow * 10) + ((totalNumberOfSeat / 2) * 8);
            } else {
               totalIncome = ((numberOfRows / 2) * numberOfSeatInEachRow * 10) + (((numberOfRows / 2) + 1) * numberOfSeatInEachRow * 8);
            }
        }

        for (int i = 0; i < numberOfRows; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < numberOfSeatInEachRow; j++) {
                row.add('S');

            }
            allRows.add(row);

        }
        System.out.println();
        int selectedMenuItem;
        do {
          printMenu();
          selectedMenuItem = scanner.nextInt();
          switch (selectedMenuItem){
              case number_1 -> showSeats(numberOfRows, numberOfSeatInEachRow);
              case number_2 -> buyTicket(totalNumberOfSeat, numberOfRows);
              case number_3 -> showStatistics(totalNumberOfSeat);
              default -> System.out.println("Wrong input");
          }
        }while (selectedMenuItem != 0);

    }

    private static void buyTicket(int totalNumberOfSeat, int numberOfRows) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number: ");
        int rowNumber = scanner.nextInt();

        System.out.println("Enter a seat number in the row: ");
        int seatNumberInRow = scanner.nextInt();

    }

    private static void showSeats(int numberOfRows, int numberOfSeatInEachRow) {
        for (int i = 0; i < numberOfSeatInEachRow; i++) {
            System.out.println(i);
            System.out.println(" ");

        }
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println(i);
            System.out.println(" ");

        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit
                """.trim());

    }
}
