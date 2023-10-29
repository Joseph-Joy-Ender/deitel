package beginWithJavaExercises;

import javax.swing.*;

public class NameUsingJOption {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome To Semicolon Village");
        String name;
        name = JOptionPane.showInputDialog("What is your name? ");

        JOptionPane.showMessageDialog(null, "Hello " + name);

    }
}
