package chapter5;

public class   ChristmasSong {
    public static void main(String[] args) {
        for (int days = 1; days <= 12; days++) {
            switch (days){
                case 1 -> System.out.println("On the First day of christmas\n my true love sent to me");
                case 2 -> System.out.println("On the Second day of christmas\n my true love sent to me");
                case 3 -> System.out.println("On the Third day of christmas\n my true love sent to me");
                case 4 -> System.out.println("On the Fourth day of christmas\n my true love sent to me");
                case 5 -> System.out.println("On the Fifth day of christmas\n my true love sent to me");
                case 6 -> System.out.println("On the Sixth day of christmas\n my true love sent to me");
                case 7 -> System.out.println("On the Seventh day of christmas\n my true love sent to me");
                case 8 -> System.out.println("On the Eighth day of christmas\n my true love sent to me");
                case 9 -> System.out.println("On the Ninth day of christmas\n my true love sent to me");
                case 10 -> System.out.println("On the Tenth day of christmas\n my true love sent to me");
                case 11 -> System.out.println("On the Eleventh day of christmas\n my true love sent to me ");
                case 12 -> System.out.println("On the Twelfth day of christmas\n my true love sent to me");
            }
            switch (days){
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a- leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a- milking");
                case 7:
                    System.out.println("Seven swarms a- swimming");
                case 6:
                    System.out.println("Six geese a- laying");
                case 5:
                    System.out.println("Five golden rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three french hens");
                case 2:
                    System.out.println("Two turtle doves");
                case 1:
                    System.out.println("A partridge in a pear tree");
                    System.out.println();
            }

        }
    }
}
