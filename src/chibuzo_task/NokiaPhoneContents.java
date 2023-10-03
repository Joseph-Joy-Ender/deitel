package chibuzo_task;

import java.util.Scanner;

public class NokiaPhoneContents {
   public static void contents() {
       Scanner input = new Scanner(System.in);
       int content = input.nextInt();
       switch (content){
           case 1 -> generalInformation();
           case 2 -> gettingStarted();
           case 3 -> basicFunctions();
           case 4 -> menuFunctions();
           case 5 -> batteryInformation();
           case 6 -> genuineAccessories();
       }
   }

    private static void genuineAccessories() {
    }

    private static void batteryInformation() {
    }

    private static void menuFunctions() {
       display("3.Menu functions.....................18");
       display("""
               Accessing a menu function.....................18
                    By scrolling.............................18
                    By shortcut..............................18
               Exiting a menu functions......................18
               phone book(Menu 1)............................19
               Messages(Menu 2)..............................20
                    Writing and sending a text message
                    (Menu 2-1)...............................20
                    Reading a text message(Menu 2-2).........21
                    Viewing a message you have saved
                    (Menu 2-3)...............................22
                    Picture messages(Menu 2-3)...............22
                    Templates(Menu 2-4)......................22
                    Smileys(Menu 2-6)........................23
                    Message settings(Menu 2-7)...............23
                    Info service(Menu 2-8)...................23
                    Voice mailbox number(Menu 2-9)...........23
                    Service command editor
                    (Menu 2-10)..............................23
               
               
               
               
               
               
               
               
               
               """);
    }

    private static void basicFunctions() {
       display("2.Basic functions................................7");
       display("""
               Making a call.............................................7
                    Making a call with phone book..........7
                    Other ways to make a call..............7
               Answering a call............................7
               In-call functions.......................8
               Listening to voice messages...............8
               Locking the keypad........................8
               Storing a phone number.....................8
               Writing text...............................8
                    Input methods...................9
                    Text input display...............9
                    Switching between input methods...............10
                    Zhuyin input method....................11
                    Stroke input method...........................12
                    Inputting English letters, numbers,
                    spaces, symbols and punctuation
                    marks.....................................15
                    Delete the contents keyed in..............16
                    Predictive English text input................16
               """);
    }

    private static void gettingStarted() {
       display("1. Getting started........................3");
       display("""
               Keys......................................3
               Displaying and standby mode........................3
               Inserting a SIM card..................................3
               Charging the battery....................................4
               Switching on or off....................................5
               Changing the covers....................................6
               """);
    }

    private static void generalInformation() {
       display("General information......................1");
       display("Stickers on the sales package............1");
       display("Network services..................1");
       display("Accessories and batteries............1");
       display("Access codes..................2");
       display("Detailed user guide....................2");
    }


    public static void display(String input){
        System.out.println(input);
    }

}
