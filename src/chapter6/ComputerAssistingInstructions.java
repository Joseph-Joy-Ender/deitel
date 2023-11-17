package chapter6;
import javax.swing.*;
import java.security.SecureRandom;
public class ComputerAssistingInstructions {
    static int number1 = generateRandomNumber();
    static int number2 = generateRandomNumber();
    public static void firstQuestion() {
        int answer;
        while (true) {
            answer = Integer.parseInt(JOptionPane.showInputDialog("How much is " + number1 + " times " + number2));
            if (answer == number1 * number2) {
                JOptionPane.showMessageDialog(null, "Very good");
                number1 = generateRandomNumber();
                number2 = generateRandomNumber();
            }
        }
    }
    public static int generateRandomNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1, 9);
    }

    public static void main(String[] args) {
        firstQuestion();
    }
}
