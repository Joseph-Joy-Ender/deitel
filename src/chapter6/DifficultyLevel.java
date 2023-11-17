package chapter6;

import javax.swing.*;
    public class DifficultyLevel {

    public static void menu(){
        int options;
        do {
            JOptionPane.showMessageDialog(null, """
                    Difficulty level 1
                    Difficulty level 2
                    Difficulty level 3
                    4. Exit
                    """);
            options = Integer.parseInt(JOptionPane.showInputDialog("Select an option"));
            switch (options) {
                case 1 -> level1();
                case 2 -> level2();
                case 3 -> level3();
            }
        }    while (options != 4);
    }

    public static void level1() {
        MonitoringStudentPerformance.firstQuestion();
    }
    public static void level2(){
        Level2.firstQuestion();
    }
    public static void level3() {
        Level3.firstQuestion();
    }
    public static void main(String[] args) {
        DifficultyLevel.menu();
    }
}
