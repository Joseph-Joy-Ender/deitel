package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseChristmasSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a day");
        int day = scanner.nextInt();
        firstLine(day);
    }

    public static void firstLine(int input) {
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] day = {"My true love brought to me"};
        String[] lyrics = {"""
My true love sent to me
A partridge in a pear tree
""",
                """
My true love brought to me
Two turtle doves
And a partridge in a pear tree
""",


                """

Three french hens
 
   







"""
        };
        System.out.println("On the " + days[input-1] +" day of christmas");
        System.out.println(lyrics[input-1]);
        System.out.println(day[input - 1]);
    }
}
