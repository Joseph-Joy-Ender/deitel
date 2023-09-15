package chibuzorAssignment;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter day of christmas: ");
        int days = userInput.nextInt();

        switch (days) {
            case 1 -> System.out.println("On the first day of christmas");
            case 2 -> System.out.println("On the second day of christmas");
            case 3 -> System.out.println("On the third day of christmas");
            case 4 -> System.out.println("On the fourth day of christmas");
            case 5 -> System.out.println("On the fifth day of christmas");
            case 6 -> System.out.println("On the sixth day of christmas");
            case 7 -> System.out.println("On the seventh day of christmas");
            case 8 -> System.out.println("On the eighth day of christmas");
            case 9 -> System.out.println("On the ninth day of christmas");
            case 10 -> System.out.println("On the tenth day of christmas");
            case 11 -> System.out.println("On the eleventh day of christmas");
            case 12 -> System.out.println("On the twelfth day of christmas");
        }

        int christmas = userInput.nextInt();
        switch (christmas) {
            case 1 -> System.out.println("""
                    My true love sent to me
                    A partridge in a pear tree
                    """);
            case 2 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 3 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 4 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 5 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 6 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 7 -> System.out.println("""
                    """ + myTrueLove() + "\n" +
                    """
                    
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 8 -> System.out.println("""
                    """ + myTrueLove() + "\n" +

                       """
                    
                    Eight maids a-milking
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 9 -> System.out.println("""
                    """ + myTrueLove() + "\n" +

                      """
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 10 -> System.out.println("""
                    
                    """ + myTrueLove() + "\n" +
                    """
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 11 -> System.out.println("""
                    
                    """ + myTrueLove() + "\n" +
                    """
                    Eleven pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree
                    """);
            case 12 -> System.out.println("""
                   
                    """ + myTrueLove() + "\n" +
                    """
                    Twelve drummers drumming
                    Eleven pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swarms are swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves
                    And a partridge in a pear tree""");
        }

    }

    private static String myTrueLove() {
        return "my true love brought to me";
    }
}


