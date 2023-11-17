package chapter6;

import javax.swing.*;

public class VaryingTypesOfProblems {
    
    public static void menu() {
        int options;
        JOptionPane.showMessageDialog(null, """
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Random mixture
                """);
        options = Integer.parseInt(JOptionPane.showInputDialog("Select an option!"));
        switch (options){
            case 1 -> additionProblems();
            case 2 -> subtractionProblems();
            case 3 -> multiplicationProblems();
            case 4 -> divisionProblems();
        }
        
    }

    private static void divisionProblems() {
        Division.firstQuestion();
    }

    private static void multiplicationProblems() {
        Multiply.firstQuestion();
    }

    private static void subtractionProblems() {
        Subtractions.firstQuestion();
    }

    private static void additionProblems() {
        Additions.firstQuestion();
    }

    public static void main(String[] args) {
        VaryingTypesOfProblems.menu();
    }
}
