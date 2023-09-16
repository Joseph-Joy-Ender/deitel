package chibuzorAssignment.LogisticsAssignment;

import java.util.Scanner;

public class DeliveryLogisticsMain {




    public static void logistics(){
        display("Enter collection rate: ");
    }


    public static int display(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        logistics();
    }
}

