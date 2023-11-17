package chapter6;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Random;

public class ReducingStudentFatigue {
    static int number1 = generateRandomNumber();
    static int number2 = generateRandomNumber();
    static String message;
    public static void firstQuestion() {
        int answer;
        while (true) {
            answer = Integer.parseInt(JOptionPane.showInputDialog("How much is " + number1 + " times " + number2));
            if (answer != number1 * number2){
               JOptionPane.showMessageDialog(null, possibleResponseToIncorrectAnswer());
            }
            if (answer == number1 * number2) {
                JOptionPane.showMessageDialog(null, possibleResponseToCorrectAnswer());
                number1 = generateRandomNumber();
                number2 = generateRandomNumber();
            }
        }
    }
    public static int generateRandomNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1, 9);
    }

    public static String possibleResponseToCorrectAnswer() {
        Random random = new Random();
        int rand = random.nextInt(1, 5);
        switch (rand) {
            case 1 -> message = "Very good!";
            case 2 -> message = "Excellent!";
            case 3 -> message = "Nice work!";
            case 4 -> message = "Keep up the good work!";
        }
        return message;

    }
    public static String possibleResponseToIncorrectAnswer() {
        Random random = new Random();
        String rand = String.valueOf(random.nextInt(1, 5));
        switch (rand) {
            case "1" -> message = "No. Please try again.";
            case "2" -> message = "Wrong. try once more.";
            case "3" -> message = "Don't give up!";
            case "4" -> message = "No. Keep trying.";

        }

        return message;
    }

    public static void main(String[] args) {
        MonitoringStudentPerformance.firstQuestion();
    }
}
