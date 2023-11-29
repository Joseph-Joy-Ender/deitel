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
        Scanner scanner = new Scanner(System.in);
        display("Enter the id: ");
        String id = scanner.nextLine();

        display("Enter the title: ");
        String title = scanner.nextLine();

        display("Enter the body: ");
        String body = scanner.nextLine();

        diary.updateEntry(Integer.parseInt(id), title, body);

        diary.print();

        mainMenu();
    }

    private static void exit() {
        display("Good bye from your favourite diary");
        System.exit(0);
    }

    private static void findEntry() {
        Scanner scanner = new Scanner(System.in);
        display("Enter your id: ");
        String id = scanner.nextLine();

        diary.findEntryById(Integer.parseInt(id));
        diary.print();

        mainMenu();
    }

    private static void deleteEntry() {
        Scanner scanner = new Scanner(System.in);
        display("Enter your id: ");
        String id = scanner.nextLine();

        diary.deleteEntry(Integer.parseInt(id));

        diary.print();
        mainMenu();
    }

    private static void createEntry() {
        Scanner scanner = new Scanner(System.in);
        try {
            display("Enter the title ");
            String title = scanner.nextLine();

            display("Enter the body ");
            String body = scanner.nextLine();

            diary.createEntries(title, body);

            diary.print();
        }catch (EntryIsLockedException exception){
            display(exception.getMessage());
            mainMenu();
        }
        mainMenu();

        
    }

    private static void lockDiary() {
        diary.lockDiary();
        display("diary successfully locked!!");

        mainMenu();
    }

    private static void unlockDiary() {
        Scanner scanner = new Scanner(System.in);
        display("Enter your password to unlock your diary");
        String password = scanner.nextLine();
        diary.unlockDiary(password);

        display("Diary unlocked!!");
        diary.print();
        mainMenu();
    }

    private static void menuMap() {
        String menu = """
                ====================================
                Welcome To Your Diary App
                ***********************************
                1 -> unlock diary
                2 -> lock diary
                3 -> create entry
                4 -> delete entry
                5 -> find entry
                6 -> update entry
                7 -> exit
                """;
        display(menu);
    }

    private static void display(String input){
        System.out.println(input);
    }
}
