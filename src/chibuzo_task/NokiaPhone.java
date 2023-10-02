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
        Scanner input = new Scanner(System.in);
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
        int phone = input.nextInt();
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
                int option = input.nextInt();
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
        Scanner input = new Scanner(System.in);
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
        int messages = input.nextInt();
        switch (messages) {
            case 1 -> mobile("Write messages");
            case 2 -> mobile("Inbox");
            case 3 -> mobile("Outbox");
            case 4 -> mobile("Picture Messages");
            case 5 -> mobile("Templates");
            case 6 -> mobile("Smileys");
            case 7 -> {
                messageSetting();
            }
            case 8 -> mobile("Info services");
            case 9 -> mobile("Voice MailBox Number");
            case 10 -> mobile("Service Command Editor");
            case 11 -> userPrompt();
            case 12 -> endProgram();
        }
    }

    private static void messageSetting() {
        Scanner input = new Scanner(System.in);
        mobile("Message settings");

        mobile("""
                1. Set 1²
                2. Common³
                3. Back
                4. exit
                """);

        int messagesSettings = input.nextInt();

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
                int set1 = input.nextInt();
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
                int common = input.nextInt();
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
        Scanner input = new Scanner(System.in);
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
                """);
        int callRegister = input.nextInt();
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
                int callDuration = input.nextInt();
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
                        """);
            }
            case 7 -> {
                mobile("Call cost settings");
                mobile("""
                         1: Call cost limit
                         2: Show costs in
                        """);
            }
            case 8 -> mobile("Prepaid credit");
            case 9 -> userPrompt();
        }
    }

    private static void tones() {
        Scanner input = new Scanner(System.in);
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
                """);
        int tones = input.nextInt();
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
        }
    }

    private static void settings() {
        Scanner input = new Scanner(System.in);
        mobile("Settings");
        mobile("""
                1 -> Call settings
                2 -> Phone settings
                3 -> Security settings
                4 -> Restore factory settings
                5 -> Back
                """);
        int setting = input.nextInt();
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
                        """);

            }
            case 2 -> {
                mobile("Phone settings");
                mobile("""
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6.confirm SIM service actions
                        7. Back
                        """);
            }
            case 3 -> {
                mobile("Security settings");
                mobile("""
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5.Phone security
                        6. Change access codes
                        7. Back
                        """);
            }
            case 4 -> mobile("Restore factory setting");
            case 5 -> userPrompt();
        }
    }

    private static void clock() {
        Scanner input = new Scanner(System.in);
        mobile("Clock");
        mobile("""
                1. Alarm clock
                2. Clock setting
                3. Date setting
                4. StopWatch
                5. Countdown timer
                6. Auto update of date and time
                7. Back
                """);
        int clock = input.nextInt();
        switch (clock) {
            case 1 -> mobile("Alarm clock");
            case 2 -> mobile("Clock setting");
            case 3 -> mobile("Date setting");
            case 5 -> mobile("StopWatch");
            case 6 -> mobile("Auto update of date and time");
            case 7 -> userPrompt();
        }
    }

    private static void calculator() {
        mobile("Calculator");
        mobile("");
    }

    private static void simServices() {
        mobile("SIM services³");
    }

    private static void profiles() {
        mobile("Profiles");
    }

    private static void reminders() {
        mobile("Reminders");
    }

    private static void games() {
        mobile("Games");
    }

    private static void callDivert() {
        mobile("call divert");
    }

    private static void chat() {
        mobile("Chat");
    }


    private static void mobile(String input) {
        System.out.println(input);
    }
}

