package chapter3;

import java.util.Scanner;

public class ExamPassed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade :");
        int Grade = input.nextInt();

       // if(Grade < 0 || Grade > 100){
         //   System.out.println("Invalid Marks!");
       // }

        if(Grade > 40) {
            System.out.println("Good Grades");
        } else if(Grade < 40) {
                System.out.println("Failed Woefully!!!");
            }
            }
        }


