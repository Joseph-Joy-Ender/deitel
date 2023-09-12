package randomExercises;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        double mark = input.nextDouble();
        if(mark >= 90){
            System.out.println("A");
        }else if(mark >= 80){
            System.out.println("B");
        }else if(mark >= 70){
            System.out.println("C");
        } else if(mark >= 60){
            System.out.println("D");
        } else{
            System.out.println("Failed!!!");
        }

    }
}
