package beginWithJavaExercises;

import javax.swing.*;
import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = scanner.nextInt();
        double circumference = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;
        String input;
       // input = JOptionPane.showInputDialog("Enter radius");
       // radius = Integer.parseInt(input);
        
        JOptionPane.showMessageDialog(null, "The circumference of circle is " + circumference);
        JOptionPane.showMessageDialog(null, "The area of circle is " + area);

    }
}
