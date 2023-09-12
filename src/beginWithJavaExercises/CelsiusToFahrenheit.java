package beginWithJavaExercises;

import javax.swing.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter celsius");
        double Fahrenheit;
        double Celsius = Double.parseDouble(input);
        Fahrenheit = 1.8 * Celsius + 32;


       JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit is " + Fahrenheit);


    }
}
