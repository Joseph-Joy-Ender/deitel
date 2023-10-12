package randomExercises;


import javax.swing.*;
import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String message ;
//        int n;
//        message = "The java Tutorials";
//        n = message.length();
//        System.out.println("The length of message: " + n);
//
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.concat(" For Beginners"));
//        System.out.println(message.substring(4));
//        System.out.println(message.substring(4,8));
//
//        System.out.println("Enter gender: ");
//        char gender = scanner.next().charAt(0);

//        JOptionPane.showMessageDialog(null, "Welcome To Semicolon Village");
//        String name;
//        name = JOptionPane.showInputDialog("What is your name? ");
//
//        JOptionPane.showMessageDialog(null, "Hello " + name);

        int iVar = Integer.parseInt("259");
        double dVar = Double.parseDouble("794.6");

        String input;
        int length;
        int width;
        int area;

        input = JOptionPane.showInputDialog("Enter Length");
        length = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter width");
        width = Integer.parseInt(input);

        area = length * width;

        JOptionPane.showMessageDialog(null, "Area of rectangle is " + area );
   }
}
