package chapter2;

public class Operations4 {

    public static void main(String[] args) {

        System.out.println(10 & 12);

        System.out.println((10 > 2) && (8 >5));

        System.out.println((2 > 4) && (3 > 7));

        System.out.println(5 & 3);

        System.out.println(10 & 5);

        System.out.println((6 < 7) || (5 < 6) || (6 < 10));

       String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       System.out.println("The length of the txt string is : " + txt.length());

       String test = "Hello Children of God";
       System.out.println(test.toUpperCase());
       System.out.println(test.toLowerCase());

       String text = "Hello Joy";
       System.out.println(text.toLowerCase());
       System.out.println(text.toUpperCase());

       String word = "ABCDEFGH";
       System.out.println(word.toUpperCase());
       System.out.println(word.toLowerCase());

       String alpha = "Please locate where 'locate' occurs!";
       System.out.println(alpha.indexOf("locate"));

       String num = "Please locate where 'Please' occurs!";
       System.out.println(num.indexOf("Please"));

       String name = "Joy Joseph is a good girl";
       System.out.println(name.indexOf("girl"));

       String firstName = "Joy";
       String secondName = "Joseph";
       System.out.println(firstName + " " + secondName);

       String initialName = "Qudus";
       String surname = "Adeshina";
       System.out.println(initialName + " " + surname);

       System.out.println(Math.max(5, 10));
       System.out.println(Math.min(5, 100));
    }
}
