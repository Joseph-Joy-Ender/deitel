package chapter6;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Random;

public class Subtractions {
    static int number1 = generateRandomNumber();
    static int number2 = generateRandomNumber();
    static String message;
    public static void firstQuestion() {
        int counter = 1;
        int score = 0;
        double percentage = 0;
        int answer;
        while (counter <= 10) {
            answer = getAnswer();
            score = getScore(answer, score);
            counter++;
            percentage = ((double) score / counter) * 100;

        }
        extracted(percentage);
    }

    private static int getAnswer() {
        int answer;
        answer = Integer.parseInt(JOptionPane.showInputDialog("How much is " + number1 + " minus " + number2));
        if (answer != number1 - number2){
            JOptionPane.showMessageDialog(null, possibleResponseToIncorrectAnswer());
        }
        return answer;
    }

    private static int getScore(int answer, int score) {
        if (answer == number1 - number2) {
            score++;
            JOptionPane.showMessageDialog(null, possibleResponseToCorrectAnswer());
            number1 = generateRandomNumber();
            number2 = generateRandomNumber();
        }
        return score;
    }

    private static void extracted(double percentage) {
        if (percentage > 75) JOptionPane.showMessageDialog(null, "Congratulations, you are ready to go to the next level!");
        else JOptionPane.showMessageDialog(null, "Please ask your teacher for extra help!");
    }

    public static int generateRandomNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1, 99);
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
}
