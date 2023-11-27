package MyDiary;

import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {

        mainMenu();
    }

    static Diary diary = new Diary("Joy", "1234");

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        menuMap();
        String input = scanner.nextLine();

        switch (input.charAt(0)) {
            case '1' -> unlockDiary();
            case '2' -> lockDiary();
            case '3' -> createEntry();
            case '4' -> deleteEntry();
            case '5' -> findEntry();
            case '6' -> updateEntry();
            case '7' -> exit();
        }

    }

    private static void updateEntry() {
    }

    private static void exit() {
        display("Good bye from your favourite diary");
        System.exit(0);
    }

    private static void findEntry() {
        
    }

    private static void deleteEntry() {
    }

    private static void createEntry() {
        Scanner scanner = new Scanner(System.in);
        display("Enter the title ");
        String title = scanner.nextLine();

        display("Enter the body ");
        String body = scanner.nextLine();

        diary.createEntry(title, body);

        diary.print();
        
    }

    private static void lockDiary() {
        
    }

    private static void unlockDiary() {
        Scanner scanner = new Scanner(System.in);
        display("Enter your password to unlock your diary");
        String password = scanner.nextLine();
        diary.unlockDiary(password);

        display("Diary unlocked!!");
        mainMenu();
    }

    private static void menuMap() {
        String menu = """
                ====================================
                Welcome To Stanbic Bank Of Africa
                ***********************************
                1 -> unlock diary
                2 -> lock diary
                3 -> create entry
                4 -> delete entry
                5 -> find entry
                6 -> exit
                """;
        display(menu);
    }

    private static void display(String input){
        System.out.println(input);
    }
}
