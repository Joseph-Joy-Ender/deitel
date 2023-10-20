package chibuzo_task;

import java.util.Scanner;

public class NokiaPhone {

    public static void main(String[] args) {
        userPrompt();

    }

    public static void userPrompt() {
        Scanner userInput = new Scanner(System.in);
        menu();
        int map = userInput.nextInt();
        switch (map) {
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> reminders();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();
            case 14 -> endProgram();
        }
    }

    public static void endProgram() {
        mobile("Good Bye!");
        System.exit(0);

    }

    public static void menu() {
        String menu = """
                ============================
                Welcome To Your Nokia Phone
                ****************************
                1 -> phoneBook();
                2 -> messages();
                3 -> chat();
                4 -> callRegister();
                5 -> tones();
                6 -> settings();
                7 -> callDivert();
                8 -> games();
                9 -> calculator();
                10 -> reminders();
                11 -> clock();
                12 -> profiles();
                13 -> simServices();
                14 -> exit;
                **************************
                Your Nokia Menu Map
                ==========================
                """;
        mobile(menu);
    }

    private static void phoneBook() {
        mobile("PhoneBook");
        mobile("""
                press
                1 -> Search
                2 -> Service Nos±
                3 -> Add Name
                4 -> Erase
                5 -> Edit
                6 -> Assign Tone
                7 -> Send b'Card
                8 -> Options
                9 -> Speed dials
                10 -> Voice tags
                11 -> Back
                12 -> exit
                """);
        int phone = input(12);
        switch (phone) {
            case 1 -> mobile("Search");
            case 2 -> mobile("Service Nos");
            case 3 -> mobile("Add Name");
            case 4 -> mobile("Erase");
            case 5 -> mobile("Edit");
            case 6 -> mobile("Assign Tone");
            case 7 -> mobile("Send b'Card");
            case 8 -> {
                mobile("Options");
                mobile("""
                        1.Type of view
                        2.Memory Status
                        3.Back
                        4.Exit
                        """);
                int option = input(4);
                switch (option) {
                    case 1 -> mobile("Type of view");
                    case 2 -> mobile("Memory status");
                    case 3 -> phoneBook();
                    case 4 -> endProgram();
                }
            }
            case 9 -> mobile("Speed dials");
            case 10 -> mobile("Voice tags");
            case 11 -> userPrompt();
            case 12 -> endProgram();
        }

    }


    private static void messages() {
        mobile("Messages");
        mobile("""
                press
                1 -> Write Messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture Messages
                5 -> Templates
                6 -> Smileys
                7 -> Message Settings
                8 -> Info Service
                9 -> Voice MailBox Number
                10 -> Service Command Editor
                11 -> Back
                12 -> exit
                """);
        int messages = input(12);
        switch (messages) {
            case 1 -> mobile("Write messages");
            case 2 -> mobile("Inbox");
            case 3 -> mobile("Outbox");
            case 4 -> mobile("Picture Messages");
            case 5 -> mobile("Templates");
            case 6 -> mobile("Smileys");
            case 7 -> messageSetting();
            case 8 -> mobile("Info services");
            case 9 -> mobile("Voice MailBox Number");
            case 10 -> mobile("Service Command Editor");
            case 11 -> userPrompt();
            case 12 -> endProgram();
        }
    }

    private static void messageSetting() {
        mobile("Message settings");
        mobile("""
                1. Set 1²
                2. Common³
                3. Back
                4. exit
                """);
        int messagesSettings = input(4);
        switch (messagesSettings) {
            case 1 -> {
                mobile("Set 1²");
                mobile("""
                        1. Message centre number
                        2. Message sent as
                        3. Message validity
                        4. Back
                        5. exit
                        """);
                int set1 = input(5);
                switch (set1) {
                    case 1 -> mobile("Message centre number");
                    case 2 -> mobile("Message sent as");
                    case 3 -> mobile("Message validity");
                    case 4 -> messageSetting();
                    case 5 -> endProgram();

                }

            }
            case 2 -> {
                mobile("Common³");
                mobile("""
                         1. Delivery reports
                         2. Reply via same centre
                         3. Character support
                         4. Back
                         5. exit
                        """);
                int common = input(5);
                switch (common) {
                    case 1 -> mobile("Delivery reports");
                    case 2 -> mobile("Reply via same centre");
                    case 3 -> mobile("Character support");
                    case 4 -> messageSetting();
                    case 5 -> endProgram();

                }
            }
            case 3 -> messages();
            case 4 -> endProgram();

        }

    }

    private static void callRegister() {
        mobile("Call register");
        mobile("""
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call lists
                5 -> Show call duration
                6 -> Show call costs
                7 -> Call cost settings
                8 -> Prepaid credit
                9 -> Back
                10 -> Exit
                """);
        int callRegister = input(10);
        switch (callRegister) {
            case 1 -> mobile("Missed calls");
            case 2 -> mobile("Received calls");
            case 3 -> mobile("dialled numbers");
            case 4 -> mobile("Erase recent call lists");
            case 5 -> {
                mobile("Show call duration");
                mobile("""
                        1: Last call duration
                        2: All call's duration
                        3: Received calls duration
                        4: Dialled call's duration
                        5: Clear timers
                        6: Back
                        7. Exit
                        """);
                int callDuration = input(7);
                switch (callDuration) {
                    case 1 -> mobile("Last call duration");
                    case 2 -> mobile("All calls duration");
                    case 3 -> mobile("Received calls duration");
                    case 4 -> mobile("Dialled call's duration");
                    case 5 -> mobile("Clear timers");
                    case 6 -> callRegister();
                    case 7 -> endProgram();
                }
            }
            case 6 -> {
                mobile("Last call ");
                mobile("""
                        1: All calls cost
                        2: Clear timer
                        3: Back
                        4: Exit
                        """);
                int lastCall = input(4);
                switch (lastCall){
                    case 1 -> mobile("All calls cost");
                    case 2 -> mobile("Clear timer");
                    case 3 -> callRegister();
                    case 4 -> endProgram();

                }
            }
            case 7 -> {
                mobile("Call cost settings");
                mobile("""
                         1: Call cost limit
                         2: Show costs in
                         3: Back
                         4: Exit
                        """);
                int callCost = input(4);
                switch (callCost){
                    case 1 -> mobile("Call cost limit");
                    case 2 -> mobile("Show costs in");
                    case 3 -> callRegister();
                    case 4 -> endProgram();
                }
            }
            case 8 -> mobile("Prepaid credit");
            case 9 -> userPrompt();
            case 10 -> endProgram();
        }
    }

    private static void tones(){
        mobile("Tones");
        mobile("""
                1 -> Ringing tone
                2 -> Ringing volume
                3 -> Incoming call alert
                4 -> Composer
                5 -> Message alert tone
                6 -> Keypad tones
                7 -> warning and game tones
                8 -> Vibrating alert
                9 -> Screen saver
                10 -> Back
                11. Exit
                """);
        int tones = input(11);
        switch (tones) {
            case 1 -> mobile("Ringing tone");
            case 2 -> mobile("Ringing volume");
            case 3 -> mobile("Incoming call alert");
            case 4 -> mobile("Composer");
            case 5 -> mobile("Message alert tone");
            case 6 -> mobile("Keypad tones");
            case 7 -> mobile("warning and game tones");
            case 8 -> mobile("Vibrating alert");
            case 9 -> mobile("Screen saver");
            case 10 -> userPrompt();
            case 11 -> endProgram();
        }
    }

    private static void settings() {
        mobile("Settings");
        mobile("""
                1 -> Call settings
                2 -> Phone settings
                3 -> Security settings
                4 -> Restore factory settings
                5 -> Back
                5 -> exit
                """);
        int setting = input(6);
        switch (setting) {
            case 1 -> {
                mobile("Call settings");
                mobile("""
                        1. Automatic redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer±
                        7. Back
                        8. Exit
                        """);
                int settings = input(8);
                switch (settings){
                    case 1 -> mobile("Automatic redial");
                    case 2 -> mobile("Speed dialling");
                    case 3 -> mobile("Call waiting options");
                    case 4 -> mobile("Own number sending");
                    case 5 -> mobile("Phone line in use");
                    case 6 -> mobile("Automatic answers");
                    case 7 -> settings();
                    case 8 -> endProgram();
                }

            }
            case 2 -> {
                mobile("Phone settings");
                mobile("""
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. confirm SIM service actions
                        7. Back
                        8. Exit
                        """);
                int phoneSettings = input(8);
                switch (phoneSettings){
                    case 1 -> mobile("Language");
                    case 2 -> mobile("Call info display");
                    case 3 -> mobile("Welcome note");
                    case 4 -> mobile("Network selection");
                    case 5 -> mobile("Lights");
                    case 6 -> mobile("Confirm SIM service actions");
                    case 7 -> settings();
                    case 8 -> endProgram();
                }
            }
            case 3 -> {
                mobile("Security settings");
                mobile("""
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        7. Back
                        8. Exit
                        """);
                int securitySetting = input(8);
                switch (securitySetting){
                    case 1 -> mobile("PIN code request");
                    case 2 -> mobile("Call barring service");
                    case 3 -> mobile("Fixed dialling");
                    case 4 -> mobile("Closed user group");
                    case 5 -> mobile("Phone setting");
                    case 6 -> mobile("Change access code");
                    case 7 -> settings();
                    case 8 -> endProgram();
                }
            }
            case 4 -> mobile("Restore factory setting");
            case 5 -> userPrompt();
            case 6 -> endProgram();
        }
    }

    private static void clock() {
        mobile("Clock");
        mobile("""
                1. Alarm clock
                2. Clock setting
                3. Date setting
                4. StopWatch
                5. Countdown timer
                6. Auto update of date and time
                7. Back
                8. Exit
                """);
        int userInput = input(8);
        switch (userInput) {
            case 1 -> mobile("Alarm clock");
            case 2 -> mobile("Clock setting");
            case 3 -> mobile("Date setting");
            case 5 -> mobile("StopWatch");
            case 6 -> mobile("Auto update of date and time");
            case 7 -> userPrompt();
            case 8 -> endProgram();
        }
    }

    private static void calculator() {
        mobile("""
                1. Calculator
                2. back
                3. end program
                """);
        int calculate = input(3);
        switch (calculate){
            case 1 -> {
                Scanner scanner = new Scanner(System.in);
                mobile("Calculator");
                mobile("Enter the operation to make use of(eg. +, -)");
                String op = scanner.nextLine();

                mobile("Enter first number: ");
                double first = scanner.nextDouble();
                mobile("Enter second number: ");
                double second = scanner.nextDouble();

                switch (op) {
                    case "+" -> System.out.println(first + second);
                    case "-" -> System.out.println(first - second);
                    case "/" -> System.out.println(first / second);
                    case "*" -> System.out.println(first * second);
                    default -> {
                        System.out.println("Invalid operator");
                        calculator();
                    }
                }
            }
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }
    }

    private static void simServices() {
        mobile("""
                1. SIM services³
                2. back
                3. end program
                """);
        int services = input(3);
        switch (services){
            case 1 -> mobile("SIM services³");
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }

    }

    private static void profiles() {
       mobile("""
               1. Profiles
               2. Back
               3. end program
               """);
       int profile = input(3);
       switch (profile){
           case 1 -> mobile("Profiles");
           case 2 -> userPrompt();
           case 3 -> endProgram();
       }

    }

    private static void reminders() {
        mobile("""
                1. Reminders
                2. back
                3. end program
                """);
        int reminder = input(3);
        switch (reminder){
            case 1 -> mobile("Reminders");
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }
    }

    private static void games() {
        mobile("""
                1. Games
                2. back
                3. end program
                """);
        int game = input(3);
        switch (game) {
            case 1 -> mobile("Games");
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }
    }

    private static void callDivert() {
        mobile("""
                1. Call divert
                2. back
                3. end program
                """);
        int calls = input(3);
        switch (calls){
            case 1 -> mobile("Call divert");
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }
    }

    private static void chat() {
        mobile("""
                1. Chat
                2. back
                3. end program
                """);
        int chats = input(3);
        switch (chats){
            case 1 -> mobile("Chats");
            case 2 -> userPrompt();
            case 3 -> endProgram();
        }
    }


    private static void mobile(String input) {
        System.out.println(input);
    }

    private static int input(int second){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input < 1 || input > second){
            mobile("Enter a number between " + 1 + " and " + second);
            input = scanner.nextInt();


        }
        return input;

    }
}

